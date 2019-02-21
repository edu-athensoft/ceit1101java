package com.athensoft.session2.oop.activity1;

import java.util.Date;

/**
 * Demo 1 - Encapsulation
 * 
 * One class as template
 * Multiple instances or objects
 * Each instance has its own state
 * The state may be changed
 * 
 * @author ildmost
 *
 */
public class ClientApp {

	public static void main(String[] args) {
		
		//create an object/instance of the class UserAccount
		UserAccount userAccount = new UserAccount();
		
		//manipulate private data only through the object's own method
		userAccount.setUserName("Peter");
		userAccount.setUserAge(35);
		userAccount.setRegisterationDate(new Date());
		
		//get the current state of an object of UserAccount
		System.out.println(userAccount);	
		
		
		
		
		//create a second object/instance of the class UserAccount
		UserAccount userAccount2 = new UserAccount();
		
		//manipulate private data only through the object's own method
		userAccount2.setUserName("Mary");
		userAccount2.setUserAge(30);
		userAccount2.setRegisterationDate(new Date());
		
		//get the current state of the 2nd object of UserAccount
		System.out.println(userAccount2);
		
	}

}
