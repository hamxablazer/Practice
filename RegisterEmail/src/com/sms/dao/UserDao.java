package com.sms.dao;

import java.util.List;

import com.sms.bean.User;

public interface UserDao {

	int register(User user);
	boolean verifyUser (String email, String password);
	
}
