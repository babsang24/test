package kr.ac.kpu.ebiz.spring.lecture5;

import java.util.List;
import java.util.Map;

public interface ActorRepository {

	Map select(Integer actorId);

	List<Map> selectAll();

	boolean delete(int actorId);
}
