package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.PortableInterceptor.Interceptor;

public class Test13 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();

		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
