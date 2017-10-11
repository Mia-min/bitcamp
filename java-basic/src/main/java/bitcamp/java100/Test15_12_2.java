// ## 연산자 - 비트 이동 연산자 (>>, >>>, <<) 응용
// - 비트 연산자의 활용 예
//

package bitcamp.java100;

public class Test15_12_2 {

    public static void main(String[] args) {
    	int n = 1234567890;
    	
    	System.out.println(Integer.toHexString(n));
    	
    	System.out.println(Integer.toHexString(n >> 24));
    	System.out.println(Integer.toHexString((n >> 16) & 0xff));
    	System.out.println(Integer.toHexString((n >> 8) & 0xff));
    	System.out.println(Integer.toHexString(n & 0xFF));
    }
}




















