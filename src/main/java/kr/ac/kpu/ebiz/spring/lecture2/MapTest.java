package kr.ac.kpu.ebiz.spring.lecture2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) throws Exception {

		// Hash 기반 Map을 생성합니다.
		Map map = new HashMap();

		// Key와 Value를 추가합니다.
		map.put("name", "Hong Gil Dong");
		map.put("email", "hong@gmail.com");

		// Key에 대한 값을 꺼내봅니다.
		System.out.println("name = " + map.get("name"));
		System.out.println("email = " + map.get("email"));

		// 현재 들어있는 아이템의 개수를 출력합니다.
		System.out.println("Map에 들어있는 아이템의 개수 : " + map.size());

		// Key로 값을 모두 꺼내봅니다.
		Set set = map.keySet();
		for (Object key : set) {
			System.out.println(key + " = " + map.get(key));
		}
	}

}
