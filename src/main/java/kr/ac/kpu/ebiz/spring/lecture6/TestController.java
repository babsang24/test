package kr.ac.kpu.ebiz.spring.lecture6;


	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
			import org.springframework.web.bind.annotation.RequestParam;
			import org.springframework.web.bind.annotation.RestController;

			import java.util.HashMap;
			import java.util.Map;

			@RestController
			@RequestMapping("/hello")
			public class TestController {

				@RequestMapping(method = RequestMethod.GET)
				public Map world(@RequestParam String name) {
					Map map = new HashMap();
					map.put("name", name);
			return map;
		}

}
