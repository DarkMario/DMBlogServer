package com.DarkMario.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DarkMario.blog.dao.UserDao;
import com.DarkMario.blog.entity.User;
import com.DarkMario.blog.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getNameById() {
		return userDao.getNameById();
	}

}
