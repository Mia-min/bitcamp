/* 코드와 주석
- 프로그램 명령을 작성할 때 주석을 다는 방법을 알아보자.
- 주석의 종류와 그 쓰임새를 알아보자!
*/

/**
이 클래스는 주석에 대한 설명을 위해 
만든 예제이다.
 */
public class Test08 {

  /**
   이 변수는 출력하려는 문자열을 저장하고 있다.
   */
  static String message = "Hello!";

  /** 프로그램을 시작할 때 제일 먼저 시작되는 명령어 블록이다.
      <b>"프로그램 엔트리(entry)"</b>라 부른다.
  */
  public static void main(String[] ags) {
    /* 표준 출력 장치(모니터)로 문자열을 출력하려면,
       다음 명령을 작성해야 한다.*/
    System.out.println(message); // 명령어 끝에 반드시 세미콜론(;)을 붙여라!
  }
}

// 주석은 컴파일할 때 제거된다.
// 코드에 대한 개발자의 의견이나 설명을 붙일 때 사용한다.

/* [여러 줄 주석]
여러 줄 주석을 
작성하고 싶을 때
사용한다.
*/

/* 여러 줄 주석을 작성할 때 이와 같이 모양을 꾸미기도 한다.
 * 이렇게 중간에 들어가는 wildcard(*) 문자는 아무 의미 없다.
 * 즉 중간에 wildcard를 넣지 않아도 된다.
 */

// [한 줄 주석]
// 줄이 끝날 때까지 주석으로 간주한다.

/**
   [javadoc(java document) 주석]
   - 프로그램 개발을 완료한 후 각 클래스나 메서드의 설명을 
     HTML 문서로 만들 때 사용한다.
   - 클래스 선언, 메서드 정의, 변수 선언 앞에 붙인다.
 */