package com.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.dao.TestDao;
import com.test.mapper.TestMapper;
import com.test.pojo.Students;

@Component
public class TestDaoImpl implements TestDao{

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public List<Students> selectByPrimaryKey(Integer sid) {
		
		return sqlSessionFactory.openSession().getMapper(TestMapper.class).selectByPrimaryKey(sid);
	}

}
