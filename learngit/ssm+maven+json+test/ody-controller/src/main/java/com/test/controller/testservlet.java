package com.test.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.json.JSONUtils;
import com.test.pojo.Students;
import com.test.service.TestService;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class testservlet
 */
@Controller
@RequestMapping("/test")
public class testservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Autowired
	private TestService testService;
	
    public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public testservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@RequestMapping("/tiao")
	protected ModelAndView selectByPrimaryKey(Integer sid)
	{
		sid=1;
		List<Students> studentlist= testService.selectByPrimaryKey(sid);
		System.out.println(studentlist.size());
		
		Map<String, Object> map=new HashMap<>();
		map.put("studentlist", studentlist);
		
		ModelAndView modelAndView=new ModelAndView("success",map);
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("students", studentlist);
		
		System.out.println(jsonObject.get("students"));
		
		return modelAndView;
	}

}
