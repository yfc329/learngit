package com.test.dao;

import java.util.List;

import com.test.pojo.Students;

public interface TestDao {

	
	List<Students> selectByPrimaryKey(Integer sid);
}
