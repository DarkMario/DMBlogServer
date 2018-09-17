package com.DarkMario.blog.service;

import com.DarkMario.blog.entity.User;
import com.alibaba.fastjson.JSONObject;

public interface UserService {
	public JSONObject userLogin(User user);
}
