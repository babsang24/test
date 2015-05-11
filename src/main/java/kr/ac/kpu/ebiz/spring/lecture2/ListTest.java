package kr.ac.kpu.ebiz.spring.lecture2;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) throws Exception {

		// Array 기반 List을 생성합니다.
		List list = new ArrayList();

		// User를 새로 생성합니다.
		User user = new User();

		// User를 추가합니다.
		list.add(user);

		// User를 순서대로 출력합니다. 하지만 아무 값도 없습니다.
		for (Object object : list) {
			System.out.println(object);
		}

		// 추가한 User를 삭제합니다.
		list.remove(user);
	}
}
