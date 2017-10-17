
public class Lotto {

	public static void main(String[] args) {
		
		//랜덤 6자리 문자열을 구해라
		System.out.println((int)(Math.random()*10)); //랜덤 0~9
	    System.out.println((char)((int)(Math.random()*26)+65)); // 랜덤 한 대문자
	    System.out.println((char)((int)(Math.random()*26)+97)); // 랜덤 한 소문자

	}

}
