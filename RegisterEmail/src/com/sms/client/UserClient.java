package com.sms.client;

import java.util.List;
import java.util.Scanner;
import com.sms.bean.User;
import com.sms.dao.UserDao;
import com.sms.dao.impl.UserDaoImpl;

public class UserClient {

	public static void main(String[] args) 
	
	{
		
		System.out.println(" Enter your Choice : ");
		Scanner sc = new Scanner(System.in);
		UserDao usDao = new UserDaoImpl();
		
		while (true)
		{
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		System.out.println("    (1) Create Account     ");
		System.out.println("        (2) Sign In        ");
		System.out.println("        (3) Sign Out       ");
		System.out.println("---------------------------");
		
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1: 
			System.out.println(" Enter Student First Name : " );
			String fname = sc.next();
			System.out.println(" Enter Student Last Name : " );
			String lname = sc.next();
			System.out.println(" Student Address : " );
			String address = sc.next();
			System.out.println(" Student Mobile Number : " );
			long mobilenumber = sc.nextInt();
			System.out.println(" Student Email : " );
			String email = sc.next();
			System.out.println(" Student Password : " );
			String password = sc.next();
			
			User ue = new User (fname, lname, address, mobilenumber, email, password); // DTO Data Transfer Object
			usDao.register(ue);
			
			break;
			
			
		case 2:
			
			System.out.print("Enter the email");
			 email = sc.next();
			 password = sc.next();
			boolean viewUsers = usDao.verifyUser(email, password);
				
				
				if(viewUsers==true)
				{
				
					System.out.println("Your "+email+"and "+ password+" matched");
					
				}
				else 
				{
					System.out.println( " Data Not Found. Create Account ");
				}
				
				break;
				
			
		case 4 : 
			
			System.out.println( " Signing Out ");
			System.exit(0);
			
		default : 
			
			System.out.println( " Choose the following numbers ");
					
		}
		
		
	}

}}
