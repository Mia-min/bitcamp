
public class Test {
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 100;
		int eng = 100;
		int math = 100;
		int sum = kor + eng + math;
		float aver = sum / 3f;
		
		System.out.printf("%s, %d, %d, %d, %d, %d\n", name, kor, eng, math, sum, aver);
	}
}
