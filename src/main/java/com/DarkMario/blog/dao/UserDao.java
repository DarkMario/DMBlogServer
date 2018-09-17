package com.DarkMario.blog.dao;
 
 
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.DarkMario.blog.entity.User;
 
 
@Mapper
public interface UserDao {
	
	public User getUser(@Param("username")String username,@Param("password")String password);
	
 
}
