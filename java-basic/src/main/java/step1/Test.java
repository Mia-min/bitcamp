//

package step1;

public class Test {
	
	public static void main(String[] args) {
		int width = 390; //기본 단위는 cm
		int height = 420;
		
		//너비와 높이를 가지고 넓이를 구한다. => 평방미터
		float area = (width * height) / 10000f;
		
		System.out.println(area);
		
		//몇 평인지 평으로 출력
		float pyeoung = area / 3.3f;
		System.out.println(pyeoung);
				
 	}
}
 