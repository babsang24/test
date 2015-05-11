package kr.ac.kpu.ebiz.spring.lecture2;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception {
		// Spring Framework의 기능중에서 .properties 파일을 처리할 수 있는
		// 기능을 활용합니다.
		ResourceLoader loader = new DefaultResourceLoader();
		Resource resource = loader.getResource("classpath:database.properties");
		InputStream is = resource.getInputStream();

		// Properties 객체를 생성합니다.
		Properties props = new Properties();

		// 파일을 로딩합니다.
		props.load(is);

		// 값을 꺼내봅니다.
		System.out.println(props.getProperty("jdbc.username"));

	}

}
