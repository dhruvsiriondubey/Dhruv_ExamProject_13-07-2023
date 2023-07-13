package com;

import java.util.HashMap;

public class User implements IValidate {
	String userId;
	String password;
	static HashMap<String, String> users = new HashMap<String, String>();

	static void addUser(String userId, String password) {
		if (users.containsKey(userId))
			System.out.println("Already Registered");
		else {
			users.put(userId, password);
			System.out.println("USER ADDED!");
		}
	}

	@Override
	public Boolean IsAuthenticated(String userid, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
