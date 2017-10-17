package step6;

public class Rect {
	int width;
	int height;

	// 인스턴스 메서드로 만들기
	// 1)static을 제거한다 => 왜?
	// 2)인스턴스 전용 메서서드를 호출하려면 인스턴스의 주소를 사용해야 한다. 파라미터를 사용하지 않고 내장 변수 this에 자동 저장된다.
	float area() {
		return (this.width * this.height) / 10000f;
	}

	float pyeong() {
		return (this.width * this.height) / 10000f / 3.3f;
	}

}
