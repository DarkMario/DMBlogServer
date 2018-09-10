package com.DarkMario.blog.dao;
 
 
import org.apache.ibatis.annotations.Mapper;

import com.DarkMario.blog.entity.User;
 
 
@Mapper
public interface UserDao {
	
	public User getNameById();
	
 
}
