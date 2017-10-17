
package bitcamp.java100;

public class Test18_5 {
	public static void main(String[] args) throws Exception {
		
		String s1 = "ABC가각간";
		
		String s2 = s1.replace("BC", "하하하");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.charAt(4));
		
		s1 = "ABBCDEBBFGH";
		System.out.println(s1.indexOf("BB")); //indexOf => 앞에서부터 문자열을 찾는다.
		
		System.out.println(s1.lastIndexOf("BB"));//lastIndexOf => 뒤에서부터 문자열을 찾는다.
		
		System.out.println(s1.substring(3));//substring => 지정된 인덱스의 문자부터 끝까지 문자열을 출력한다.
		System.out.println(s1.substring(3, 6));//substring => 시작부터 끝 인덱스의 숫자를 지정하면 끝 인덱스 직전의 문자는 포함하지 않고 출력한다. => 마지막 숫자가 6이기 때문에 5까지의 문자열을 출력한다.
		
		s1 = "홍길동";
		System.out.println(s1.startsWith("홍"));//startsWith => 해당 문자열이 주어진 문자열로 시작하는지 확인한다. 리턴값은 true / false이다.
		System.out.println(s1.endsWith("홍"));//endsWith => 해당 문자열이 주어진 문자열로 끝나는지 확인한다. 리턴값은 true / false이다.
		
		s1 = "홍길동, 유관순, 안중근, 임꺽정, 윤봉길, 이육사, 윤동주";
		System.out.println(s1.contains("꺽정"));//contains => 해당 문자열에 주어진 문자열이 있는지 검사한다. 리턴값은 true / false이다.
		System.out.println(s1.contains("소월"));
		
		System.out.println("-----------------------------------------------------------------");
		
		s1 = "ABC";
		String s3 = "ABC";
		String s4 = "가각간";
		System.out.println(s3.concat(s4));//concat => 해당 문자열에 주어진 문자열을 추가하여 새로운 String 인스턴스를 만든다.
		System.out.println(s3);//주의! 절대로 기존 String 인스턴스의 값은 바뀌지 않는다.
		System.out.println(s4);
		
		System.out.println("-----------------------------------------------------------------");
		
		s3 = new String("탕수육");
		s4 = new String("물만두");
		String s5 = new String("군만두");
		String s6 = new String("탕수육");
		
		System.out.println(s3.compareTo(s6));//compareTo => 두 문자열을 비교해 같은 내용이면 0을 리턴한다.
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		
		System.out.println("-----------------------------------------------------------------");
		
		s1 = "홍길동";
		s2 = "";
		s3 = null;//인스턴스 없음
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());
		
		System.out.println(s1.length());//String 인스턴스에 저장된 문자의 개수를 리턴한다.
		System.out.println(s2.length());
		//System.out.println(s3.length());
		
		System.out.println("-----------------------------------------------------------------");
		
		s1 = "홍길동,유관순,안중근,임꺽정,윤봉길,이육사,윤동주";
		String[] arr = s1.split(",");
		for(String s : arr) {
			System.out.print(s);
			System.out.print("***");
		}
		System.out.println();
		
		arr = s1.split(" ");//s1을 공백으로 잘라라 => s1에 공백이 없으므로 잘린 부분 없음
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		s1 = "";//빈 문자열도 문자열이기 때문에 배열로 리턴된다.
		arr = s1.split(",");
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		s1 = "ghd rlf ehd";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
				
		s1 = ("  \t홍\t길 동 \n 입니다. \n\n\n\t\n ");
		System.out.print(">");
		System.out.print(s1.trim());
		System.out.println("<");
		
		System.out.println("-----------------------------------------------------------------");
		
		s1 = "ABC\n가각간\n똘똠똥";
		byte[] bytes = s1.getBytes();
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0x00ff));
			System.out.println(" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------------------------------------");
				
		bytes = s1.getBytes("UTF-8");//os에 상관 없이 동일한 결과를 얻으려면 가능한 문자 집합을 명시하여 바이트 배열을 만들어야 한다!
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0x00ff));
			System.out.println(" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------------------------------------");
		
		s1 = String.valueOf(true);
		s2 = String.valueOf(3.14);
		s3 = String.valueOf(100);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("-----------------------------------------------------------------");
		
		//문자열을 다루는 특별한 연산자 "+"
		s1 = "ABC";
		s2 = "가각간";
		s3 = s1 + s2;//두 문자열을 연결하여 새 String 인스턴스를 만든다. 주소를 더하는 것이 아니다.
		
		System.out.println(s1);//원본은 변하지 않는다.
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("-----------------------------------------------------------------");
		
		
		
	}
}