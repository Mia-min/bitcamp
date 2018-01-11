// 다형성 - 오버로딩(overloading)
// => 파라미터의 개수나 타입, 순서가 다르더라도
//    같은 기능을 수행하는 메서드에 대해 
//    같은 이름을 부여함으로써 
//    개발자가 같은 기능에 대해 같은 이름의 메서드를 사용할 수 있도록 
//    일관성을 제공하는 문법이다.  
package bitcamp.java100.ch08.ex8;

public class Test4 {
    
    public static void main(String[] args) {
        A obj = new A();
        
        // 리턴 타입이 없는 메서드 호출,
        // => 값을 안주니까 안 받는다.
        obj.m1(100); // OK!
        
        // => 값을 안주는데 받겠다고 하면 오류!
        //int value = obj.m1(200); // 컴파일 오류!
        
        // 리턴 타입이 있는 메서드 호출,
        // => 주는 값을 안받아도 된다. 
        obj.m2();
        
        // => 물론 주는 값을 변수에 받을 수 있다.
        int result = obj.m2();
        
        // 그래서 리턴 값을 받느냐 안 받느냐로 호출할 메서드를 구분할 수 없다!
        // 즉 C 클래스처럼 리턴 타입만 다른 메서드를 오버로딩 할 수 없다!
    }
}







