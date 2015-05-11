package kr.ac.kpu.ebiz.spring.lecture2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPropertiesTest {

	public static void main(String[] args) throws Exception {
		// Spring Framework IoC Container를 초기화합니다.
		ApplicationContext context =
			new ClassPathXmlApplicationContext("spring.xml");

		Database db = context.getBean(Database.class);

		// 값을 꺼내봅니다. 값이 어떻게 설정되어 있는지 확인해보세요!!
		System.out.println(db.getUsername());

	}

}
