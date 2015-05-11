package kr.ac.kpu.ebiz.spring.lecture3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		// Spring Framework를 초기화한다.
		// 이때 XML에 정의되어 있는 Object가 생성된다.
		ApplicationContext context =
			new ClassPathXmlApplicationContext("kr/ac/kpu/ebiz/spring/lecture3/spring.xml");

		System.out.println("Spring Framework가 초기화되었습니다.");

		User user = context.getBean("user1", User.class);
	}

}
