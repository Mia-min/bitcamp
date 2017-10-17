
public class Drain {

	//2의 배수로 나열하기 ex)2, 4, 6, 8...
	public static void main(String[] args) {
		for(int a = 0; a < 20; a++) { //a는 0보다 크고 10보다 작을때 증가 반복시켜라
			if(a % 2 == 0) { //a를 2로 나눴을 때 나머지가 있다면 그 수는 0과 같다
				System.out.println(a);
			}
		}

	}

}
