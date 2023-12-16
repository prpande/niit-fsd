package com.bej.springioc;

public class User 
{

	private int userId;
	private String userName;
	private String password;
	
	public User(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + "," +
				" userName=" + userName + "," +
				" password=" + password + "]";
	}

}



