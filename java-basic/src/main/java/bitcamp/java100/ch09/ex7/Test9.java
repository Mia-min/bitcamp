package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test9 {

	static class Mykey {
		String id;
		String pwd;

		public Mykey(String id, String pwd) {
			this.id = id;
			this.pwd = pwd;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Mykey other = (Mykey) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (pwd == null) {
				if (other.pwd != null)
					return false;
			} else if (!pwd.equals(other.pwd))
				return false;
			return true;
		}
		
		
		
	}

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
		// KEY-VALUE 한 쌍으로 이루어진 값을 보관할 때 사용한다.
		// 키는 값을 저장하고 찾을 때 사용한다.
		// value는 보관하고자 하는 값을 말한다.
		// hashmap객체를 생성할 때 키의 타입과 value의 타입 이름을 넘겨야한다.
		HashMap<Mykey,Contact> map = new HashMap<>();

		Contact c1 = new Contact("홍길동", "hong@aaaa.aaa", "1111-1111");
		Mykey k1 = new Mykey("aaa", "1111");
		
		map.put(k1, c1);
		
		
		System.out.println(map.get(k1));

		Mykey k2 = new Mykey("aaa", "1111");
		System.out.println(map.get(k2));

		// 해쉬셋이 데이터를 저장하는 원리 , 해쉬셋이 중복 데이터임을 판단하는 기준
		// 해쉬샛은 집합의 기능을 구현한 것이기 때문에 중복 데이터를 저장하지 않는다.
		// 중복데이터의 기준은? 해쉬코드의 리턴값이 같다. 이퀄스로 비교했을 때 리턴 값이 트루이다.
		// 그러나 오브젝트로부터 그냥 상속받은 해쉬코드는 인스턴스가 다르면 무조건 다른 해쉬값을 리턴한다.

	}
}
