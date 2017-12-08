// Spring IoC(Inversion of Control) 컨테이너 - 팩토리 메서드를 사용한 객체 생성
// 
package bitcamp.java100.ch20.ex8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext(
				"bitcamp/java100/ch20/ex8/application-context1.xml");

		System.out.println("--------------------------------------------");

		Car car = (Car) appCtx.getBean("c1");
		System.out.println(car);

	}

}
