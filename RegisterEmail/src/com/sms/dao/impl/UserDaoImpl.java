package com.sms.dao.impl;
import java.util.ArrayList;
import java.util.List;
import com.sms.bean.User;
import com.sms.dao.UserDao;


public class UserDaoImpl implements UserDao {

	List<User> addUsers = new ArrayList<>(); // Data Structure try to specify array list
	
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		addUsers.add(user); // The request will create from the client and pass here.
		// We are just adding thats why
		System.out.println(" User Added Successfully ");
		return 0;
	}


	public boolean verifyUser(String String) 
	{
		// TODO Auto-generated method stub
		
		for (User us : addUsers )
		{
			if ( us.equals(email) && us.equals (password) )
			{
				return true;
			}
		}
		return false;
	}

}

