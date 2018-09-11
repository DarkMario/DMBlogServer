package com.DarkMario.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DarkMario.blog.entity.User;
import com.DarkMario.blog.service.UserService;
import com.alibaba.fastjson.JSONObject;

@RestController
public class indexController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String hello() {
		System.out.println("有一位访客来到了");
		return "欢迎来到我的世界";
	}

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
	@RequestMapping("/getUser")
	private String getUser() {
		User u = userService.getNameById();

		return JSONObject.toJSONString(u);
	}
	
	
	@RequestMapping("/setUser")
	private void setUser(User user) {
	System.out.println(user.toString());	
	}
}
