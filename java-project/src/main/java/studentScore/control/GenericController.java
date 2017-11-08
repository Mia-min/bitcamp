package studentScore.control;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericController<T> {
    
    // 컨트롤러 클래스들이 공통으로 사용하는 객체를 선언한다.
    static Scanner keyScan = new Scanner(System.in);
    
    protected ArrayList<T> list = new ArrayList<>();

    // 컨트롤러 클래스들이 공통으로 갖는 메서드를 정의한다.
    // => 서브 클래스에서 자신의 역할에 맞게 상세히 정의할 것이기 때문에
    //    이 클래스에서는 그냥 메서드의 규격(prototype)만 정의한다.
    // => 메서드 규격?
    //    메서드명, 리턴타입, 파라미터 타입 및 순서
    // => 자바에서는 메서드 규격을 "메서드 시그너처(method signature)"라
    //    부른다.
    // => C/C++에서는 메서드 규격을 "함수 프로토타입(function prototype)"이라
    //    부른다.
    public abstract void execute();
    
}









