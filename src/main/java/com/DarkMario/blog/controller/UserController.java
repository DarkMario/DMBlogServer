package com.DarkMario.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.DarkMario.blog.entity.User;
import com.DarkMario.blog.service.UserService;
import com.alibaba.fastjson.JSONObject;

@RestController
public class UserController {
	@Autowired
	private UserService userService;


	@RequestMapping("/")
	public String hello() {
		System.out.println("有一位访客来到了");
		return "彰显气质的空白页面!";
	}

	@RequestMapping(value="/login", method = { RequestMethod.POST }, produces="application/json;charset=UTF-8")
	public String login(User user){
			JSONObject loginMsg = userService.userLogin(user);
			return loginMsg.toJSONString();
	}
	
	@RequestMapping("/resetPassword")
	public String resetPassword(User user){
//		User userLogin = userService.getUser(user);
//		if (userLogin == null) {
			return "登录失败！请重试！";
//		}else {
//			return JSONObject.toJSONString(userLogin);
//		}
	}

	
	@RequestMapping("/setUser")
	private void setUser(User user) {
	System.out.println(user.toString());	
	}
}
