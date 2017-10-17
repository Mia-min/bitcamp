
//String 클래스 사용법 - 정규식을 사용하여 문자열을 검사하기
package bitcamp.java100;

import java.util.regex.Pattern;

public class Test18_6 {
	public static void main(String[] args) throws Exception {
		String email = "example@mail.com";
		
		System.out.println(email.matches("1example@mail.com"));
		
		System.out.println(email.matches(".+@.+\\..+"));
		
		System.out.println(email.matches("^\\D.+@.+\\..+"));
		
		System.out.println("-----------------------------------------------------------------");
		
		String str = "홍길동(hong@test.com),임꺽정(im@test.com)," +
					"유관순(you@test.com),안중근(ahn@test.com),윤봉길(yoon@test.com)";
		java.util.regex.Pattern pattern = 
				java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
		java.util.regex.Matcher matcher = pattern.matcher(str);
		int startIndex = 0;
		while(matcher.find(startIndex)) {
			System.out.println(startIndex);
			String machString = matcher.group();
			startIndex = matcher.end();
				
			System.out.println(machString);
		}
		
	}
}


//참고 http://highcode.tistory.com/6

