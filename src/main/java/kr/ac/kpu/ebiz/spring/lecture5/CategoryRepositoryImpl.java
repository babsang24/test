package kr.ac.kpu.ebiz.spring.lecture5;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class CategoryRepositoryImpl extends SqlSessionDaoSupport implements CategoryRepository {

	public Map select(Integer actorId) {
		return getSqlSession().selectOne("CategoryRepository.select", actorId);
	}

	public List<Map> selectAll() {
		return getSqlSession().selectList("CategoryRepository.selectAll");
	}

	public boolean insert(Map category) {
		return getSqlSession().insert("CategoryRepository.insert", category) > 0;
	}

}
