/*소스 파일의 인코딩을 지정하기
 */
class Test02 { 
  public static void main(String[] args) { 
    System.out.println("안녕하세요!"); 
  } 
} 

/*
컴파일 할 때 인코딩 오류가 발생하는 이유?
  -윈도우에서 컴파일을 하면 인코딩 오류가 발생한다.
이유?
  -자바 컴파일러는 소스 파일을 컴파일 할 때 운영체제가 기본으로 사용 하는 문자형식으로 되어 있다고 간주한다.
  하지만, visual studio code에서 자바 소스 파일을 저장할 때 운영체제의 기본 문자 형식이 아닌 utf-8이라는 형식으로 저장한다.
  그러니 컴파일러가 제대로 번역 할 수 없다.
해결책?
  -컴파일러에게 소스파일의 문자 형식이 무엇으로 되어 있는지 알려줘야한다.
  java -encoding UTF-8 Test02.java
맥이나 리눅스에서 오류가 나지 않는 이유?
기본이 UTF-8이기 때문

*/