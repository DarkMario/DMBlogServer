package com.DarkMario.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DarkMario.blog.dao.UserDao;
import com.DarkMario.blog.entity.User;
import com.DarkMario.blog.service.UserService;
import com.alibaba.fastjson.JSONObject;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public JSONObject userLogin(User user) {
		User obj =null;
		JSONObject msg = new  JSONObject();
		try {
			obj = userDao.getUser(user.getUsername(),user.getPassword());
		} catch (Exception e) {
			msg.put("code", 1);
			msg.put("msg", "我他娘什么都没查到!你这厮是不是没给参数？");
			return msg;
		}	
		if (obj == null) {
			msg.put("code", 2);
			msg.put("msg", "登录失败!请重试!");
			return msg;
		}else {
			msg.put("code", 0);
			msg.put("user", JSONObject.toJSONString(obj));
			return msg;
		}

	}

}
