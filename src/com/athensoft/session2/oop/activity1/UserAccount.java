package com.athensoft.session2.oop.activity1;

import java.util.Date;

/**
 * Demo 1 - Encapsulation
 * @author ildmost
 *
 */
public class UserAccount {				//step 1. declare a class
	
	
	private String userName;			//step 2. writing fields
	private int userAge;
	private Date registerationDate;
	
	
	
	public String getUserName() {		//step 3. writing method, implement to manipulate data
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public Date getRegisterationDate() {
		return registerationDate;
	}
	public void setRegisterationDate(Date registerationDate) {
		this.registerationDate = registerationDate;
	}
	
	
	@Override
	public String toString() {
		return "UserAccount [userName=" + userName + ", userAge=" + userAge + ", registerationDate=" + registerationDate
				+ "]";
	}
	
	
}
