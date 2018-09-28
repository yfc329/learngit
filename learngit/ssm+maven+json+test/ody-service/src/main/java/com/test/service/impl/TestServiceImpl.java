package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TestDao;
import com.test.pojo.Students;
import com.test.service.TestService;
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testdaoimpl;
	
	public TestDao getTestdaoimpl() {
		return testdaoimpl;
	}

	public void setTestdaoimpl(TestDao testdaoimpl) {
		this.testdaoimpl = testdaoimpl;
	}

	@Override
	public List<Students> selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return testdaoimpl.selectByPrimaryKey(sid);
	}

}
