//

package step4;

//4단계: 클래스를 별도의 파일로 분리 => 장점 : 다른 예제에서도 Rect라는 클래스를 사용할 수 있다.
public class Test {

	static float area(Rect r) {
		return(r.width * r.height) / 10000f;
	}
	
	//평을 구하는 메서드 (){}
	static float pyeong(Rect r) {
		return(r.width * r.height) / 10000f / 3.3f;
	}
	
	public static void main(String[] args) {
		Rect rect; // 인스턴스 주소를 저장할 레퍼런스 변수 먼저 설정해준다.
		Rect r = new Rect(); // 인스턴스를 생성하고 그 주소를 래퍼런스에 저장한다.
		
		//인스턴스의 각 필드(항목)에 값을 저장한다.
		r.width = 390;
		r.height = 420;		
		
		//너비와 높이를 가지고 넓이를 구한다. => 평방미터
		System.out.println(area(r));
		
		//몇 평인지 평으로 출력
		System.out.println(pyeong(r));
				
 	}
}
 