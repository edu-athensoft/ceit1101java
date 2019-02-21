package com.athensoft.session2.oop.activity2;

import java.util.Date;

import com.athensoft.session2.oop.activity1.UserAccount;

/**
 * Demo 2 - Object's identity
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
		userAccount2.setUserName("Peter");
		userAccount2.setUserAge(35);
		userAccount2.setRegisterationDate(new Date());
		
		//get the current state of the 2nd object of UserAccount
		System.out.println(userAccount2);
		
		
		//proof they are different
		System.out.println(userAccount.hashCode());
		System.out.println(userAccount2.hashCode());
		
	}
	
}
