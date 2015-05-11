package kr.ac.kpu.ebiz.spring.lecture3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisposableUserTest {

	public static void main(String[] args) {
		// Spring Framework를 초기화한다.
		// 이때 XML에 정의되어 있는 Object가 생성된다.
		AbstractApplicationContext context =
			new ClassPathXmlApplicationContext("kr/ac/kpu/ebiz/spring/lecture3/disposalbean.xml");

		System.out.println("Spring Framework가 초기화되었습니다.");

		DisposableUser user = context.getBean(DisposableUser.class);

		// Spring Framework를 종료
		context.close();
	}
}
