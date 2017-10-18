// ## String 클래스 사용법
// 

package bitcamp.java100;

public class Test18_7 {

    public static void main(String[] args) throws Exception {
        //Immutable 객체
    	//한번 값이 설정되면 메모리의 값을 바꿀 수 없는 객체
    	String s1 = "hello";
    	
    	String s2 = s1.replace("l", "x");
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	
    	//Mutable 객체
    	//메모리의 값을 변경할 수 있는 객체
    	StringBuffer sb1 = new StringBuffer("Hello!");
    	
    	sb1.append("World!");
    	System.out.println(sb1);
    	
    	sb1.replace(2, 4, "xx");
    	System.out.println(sb1);
    	
        
    }
    
}











