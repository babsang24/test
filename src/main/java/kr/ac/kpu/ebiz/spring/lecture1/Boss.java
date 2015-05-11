package kr.ac.kpu.ebiz.spring.lecture1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boss {

	public static void main(String[] args) {

		// Spring Framework를 초기화한다.
		// 이때 XML에 정의되어 있는 Object가 생성된다.
		ApplicationContext context =
			new ClassPathXmlApplicationContext("kr/ac/kpu/ebiz/spring/lecture1/spring.xml");

		// 컨테이너에 있는 Driver를 꺼내온다.
		Driver driver = (Driver) context.getBean("driver");

		// 사장님께서 운전수에게 운전을 시킨다.
		driver.drive();
	}

}
