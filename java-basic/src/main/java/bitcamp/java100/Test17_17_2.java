//

package bitcamp.java100;

public class Test17_17_2 {
	//평방미터를 구하는 메서드(){}
	static float area(int frist, int scd) {
		return(frist * scd)/10000f;
	}
	//평을 구하는 메서드 (){}
	static float pyeong(int width, int height) {
		return(width * height) / 10000f / 3.3f;
	}
	
	public static void main(String[] args) {
		int width = 390; //기본 단위는 cm
		int height = 420;
		
		//너비와 높이를 가지고 넓이를 구한다. => 평방미터
		System.out.println(area(width, height));
		
		//몇 평인지 평으로 출력
		System.out.println(pyeong(width, height));
				
 	}
}
 