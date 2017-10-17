//

package bitcamp.java100;

public class Test17_14 {
	
	static void swap(int a, int b) {
		int temp = a;//int temp에 a 변수를 넣는다.
		a = b;//a에 b 변수를 넣는다.
		b = temp; //b에 temp를 넣는다.
		System.out.printf("swap(): a = %d, b = %d\n", a, b);		
	}
	
	static void swap2(int[] r) {
		int temp = r[0];
		r[0] = r[1];
		r[1] = temp;
		System.out.printf("swap2(): p[0] = %d, p[1] = %d\n", r[0], r[1]);
	}
	
	public static void main(String[] args) {
		int a = 5; //int a는 5이다.
		int b= 7; //int b는 7이다.
		//호출할 때 값을 넘기는 예
		swap(a, b);//swap을 이용해 a와 b를 호출한다.
		System.out.printf("main(): a = %d, b = %d\n", a, b);
		
		int[] arr = new int[2];
		arr[0] = 5;
		arr[1] = 7;
		swap2(arr);
		System.out.printf("main(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
	}
}
