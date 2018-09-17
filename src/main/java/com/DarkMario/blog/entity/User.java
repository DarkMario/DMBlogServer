package com.DarkMario.blog.entity;

import java.util.Date;

public class User {
	private String username;//用户名
	private String password;//用户密码
	private String new_password;//新密码(重置密码用)
	private Date created_time;//帐户创建时间
	private Date last_login_time;//上次登录时间
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public Date getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}	
	public String getNew_password() {
		return new_password;
	}
	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", created_time=" + created_time
				+ ", last_login_time=" + last_login_time + "]";
	}

	
}
