package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test6 {
	
	static class Contact {
		String name;
		String email;
		String tel;
		
		public Contact(String name, String email, String tel) {
			this.name = name;
			this.email = email;
			this.tel = tel;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
			Contact other = (Contact) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (tel == null) {
				if (other.tel != null)
					return false;
			} else if (!tel.equals(other.tel))
				return false;
			return true;
		}
	}
	
	
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍길동";
		
		set.add(new String("홍길동"));
		set.add(new String("임꺽정"));
		set.add(new String("유관순"));
		
		System.out.println(set.size());
		
		String[] arr = new String[set.size()];//여기에 setsize 넣으면 배열이 같아지는데 여기 넣는거 어떻게 앎?
		String[] arr2 = set.toArray(arr);
		
		if(arr == arr2) {
			System.out.println("arr == arr2");
		}else {
			System.out.println("arr != arr2");
		}
		
		for(String s : arr) {
			System.out.printf("%s ", s);
		}
			
		
		for(int i = 0; i < set.size(); i++) {
			//System.out.println(set.get(i));
		}
		
		System.out.println();
		
		for(String s : set) {
			System.out.println(s);
		}
		
		//해쉬셋이 데이터를 저장하는 원리 , 해쉬셋이 중복 데이터임을 판단하는 기준
		//해쉬샛은 집합의 기능을 구현한 것이기 때문에 중복 데이터를 저장하지 않는다.
		//중복데이터의 기준은? 해쉬코드의 리턴값이 같다. 이퀄스로 비교했을 때 리턴 값이 트루이다.
		//그러나 오브젝트로부터 그냥 상속받은 해쉬코드는 인스턴스가 다르면 무조건 다른 해쉬값을 리턴한다.
		
	}
}
