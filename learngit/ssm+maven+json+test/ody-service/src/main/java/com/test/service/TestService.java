package com.test.service;

import java.util.List;

import com.test.pojo.Students;

public interface TestService {

	
	List<Students> selectByPrimaryKey(Integer sid);
}
