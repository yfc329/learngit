package com.test.mapper;

import java.util.List;

import com.test.pojo.Students;

public interface TestMapper {

	
	List<Students> selectByPrimaryKey(Integer sid);
	
}
