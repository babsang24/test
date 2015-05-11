package kr.ac.kpu.ebiz.spring.lecture5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;

public class CategoryRepositoryTest {

	public static void main(String[] args) {
		// Spring Framework를 초기화한다. 이때 XML에 정의되어 있는 Object가 생성된다.
		ApplicationContext context =
			new ClassPathXmlApplicationContext("kr/ac/kpu/ebiz/spring/lecture5/spring-mybatis.xml");

		System.out.println("Spring Framework가 초기화되었습니다.");

		CategoryRepository repository = context.getBean(CategoryRepository.class);

		System.out.println(repository.selectAll());

		HashMap category = new HashMap();
		category.put("name", "Hello World");
		category.put("last_update", new Date());
		repository.insert(category);
	}
}