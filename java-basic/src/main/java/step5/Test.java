//

package step5;

//5단계: 넓이를 구하는 메서드를 별도의 클래스로 분류한다.
public class Test {

	public static void main(String[] args) {
		Rect rect; // 인스턴스 주소를 저장할 레퍼런스 변수 먼저 설정해준다.
		rect = new Rect(); // 인스턴스를 생성하고 그 주소를 래퍼런스에 저장한다.
		
		//인스턴스의 각 필드(항목)에 값을 저장한다.
		rect.width = 390;
		rect.height = 420;		
		
		//너비와 높이를 가지고 넓이를 구한다. => 평방미터
		System.out.println(Rect.area(rect));
		
		//몇 평인지 평으로 출력
		System.out.println(Rect.pyeong(rect));
				
 	}
}
 