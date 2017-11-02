package bitcamp.java100.ch09.ex7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test12 {

	static class Contact {
		String name;
		String email;
		String tel;

		public Contact(String name, String email, String tel) {
			this.name = name;
			this.email = email;
			this.tel = tel;
		}
	}

	public static void main(String[] args) {

		HashMap<String, Contact> map = new HashMap<>();

		map.put("c01", new Contact("홍길동", "hong@aaaa.aaa", "1111-1111"));
		map.put("c02", new Contact("홍길동", "hong@aaaa.aaa", "1111-1111"));
		map.put("c03", new Contact("홍길동", "hong@aaaa.aaa", "1111-1111"));
		map.put("c04", new Contact("홍길동", "hong@aaaa.aaa", "1111-1111"));
		map.put("c05", new Contact("홍길동", "hong@aaaa.aaa", "1111-1111"));

		Set<Entry<String, Contact>> entrySet = map.entrySet();

		for (Entry<String, Contact> entry : entrySet) {
			String key = entry.getKey();
			Contact contact = entry.getValue();
			System.out.printf("%s=%d\n", key, contact.name, contact.email, contact.tel);
		}

	}
}
