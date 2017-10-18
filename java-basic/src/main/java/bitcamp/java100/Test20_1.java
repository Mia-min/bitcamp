// ## String 클래스 사용법 - String 인스턴스 생성
// - 개발자가 문자열을 쉽게 다룰 수 있도록 자바에게 기본으로 제공하는 부품이다.
// - 문자열을 저장하려면 char 배열이 필요한데,
//   개발자가 직접 char 배열을 다루는 것이 아니라
//   String 클래스에서 제공해주는 메서드를 사용하여 char 배열 메모리를 다룬다.
//

package bitcamp.java100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Test20_1 {

    public static void main(String[] args) {
    	ArrayList l;
    	HashSet s;
    	HashMap m;
    	
    	int i = 10;
    	
    	Integer i2 = new Integer(10);
    	
    	int i3 = i2.intValue();
    	
    	float f1 = i2.floatValue();
    	
    	System.out.println(Integer.MIN_VALUE);
    	System.out.println(Integer.MAX_VALUE);
    	
    	int value = Integer.parseInt("2345");
    	System.out.println(value + 100);
    	
    	System.out.println(Integer.toBinaryString(44036));
    	System.out.println(Integer.toOctalString(44036));
    	System.out.println(Integer.toHexString(44036));
    	System.out.println();
    }
    
}











