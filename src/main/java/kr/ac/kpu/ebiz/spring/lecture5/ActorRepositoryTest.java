package kr.ac.kpu.ebiz.spring.lecture5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActorRepositoryTest {

	public static void main(String[] args) {
		// Spring Framework를 초기화한다. 이때 XML에 정의되어 있는 Object가 생성된다.
		ApplicationContext context =
			new ClassPathXmlApplicationContext("kr/ac/kpu/ebiz/spring/lecture5/spring-mybatis.xml");

		System.out.println("Spring Framework가 초기화되었습니다.");

		ActorRepository repository = context.getBean(ActorRepository.class);

		System.out.println(repository.select(1));

		repository.delete(1);

		System.out.println(repository.select(1));
	}

}
