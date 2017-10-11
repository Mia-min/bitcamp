// ## 연산자 - 비트 이동 연산자 (>>, >>>, <<) 응용
// - 비트 연산자의 활용 예
//

package bitcamp.java100;

public class Test15_12_1 {

    public static void main(String[] args) {
    	int k = 86;
    	// >> 1 비트 이동하는 것은 2로 나누는 것 과 같은 효과를 낸다.

    	System.out.println(k >> 1); //k 나누기 2를 한 것과 같다.
    	System.out.println(k >> 2); //k 나누기 4를 한 것과 같다.
    	System.out.println(k >> 3); //k 나누기 6를 한 것과 같다.
    	System.out.println(k >> 4); //k 나누기 8를 한 것과 같다.
    	
    	k = -86;

    	System.out.println(k >> 1); //k 나누기 2를 한 것과 같다.
    	System.out.println(k >> 2); //k 나누기 4를 한 것과 같다.
    	System.out.println(k >> 3); //k 나누기 6를 한 것과 같다.
    	System.out.println(k >> 4); //k 나누기 8를 한 것과 같다.
    	System.out.println();
    	
    	/// >>>
    	
    	k = 86;

    	System.out.println(k >>> 1); 
    	System.out.println(k >>> 2);
    	System.out.println(k >>> 3);
    	System.out.println(k >>> 4); 
    	
    	k = -86;
    	
    	System.out.println(k >>> 1); 
    	System.out.println(k >>> 2);
    	System.out.println(k >>> 3);
    	System.out.println(k >>> 4); 
    	System.out.println(); 
    	
    	/// <<
    	
    	k = 5;

    	System.out.println(k << 1); //k 곱하기 2에 2승를 한 것과 같다.
    	System.out.println(k << 2);	//k 곱하기 2에 4승을 한 것과 같다.
    	System.out.println(k << 3); //k 곱하기 2에 6승을 한 것과 같다.
    	System.out.println(k << 4); //k 곱하기 2에 8승을 한 것과 같다.
    	
    	k = -5;
    	
    	System.out.println(k << 1); //k 곱하기 2에 2승를 한 것과 같다.
    	System.out.println(k << 2);	//k 곱하기 2에 4승을 한 것과 같다.
    	System.out.println(k << 3); //k 곱하기 2에 6승을 한 것과 같다.
    	System.out.println(k << 4); //k 곱하기 2에 8승을 한 것과 같다.
    	
    	for (int i = 0; i < 40; i++) {
    		System.out.printf("%s, %d\n", Integer.toBinaryString(k << i), k << i);
    	}
    }
}




















