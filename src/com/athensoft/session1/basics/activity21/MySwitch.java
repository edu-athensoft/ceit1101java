package com.athensoft.session1.basics.activity21;

/**
 * Activity 21 - switch-case structure and branching
 * @author Athens
 *
 */
public class MySwitch {

	public static void main(String[] args) {
		testSwitchInt();
		
		testSwitchChar('B');
		
		testSwitchString();
		

	}
	
	//switch before jdk 8 
	public static void testSwitchInt() {
		final int HTTP_STATUS_CODE = 403;
				
		String desc = "unknown";
		
		
		switch(HTTP_STATUS_CODE) {
			case 200:
				desc = "OK";
				break;
			case 403:
				desc = "Forbidden";
				break;
			case 404:
				desc = "Page Not Found";
				break;
			case 500:
				desc = "Internal Server Error";
				break;
			default:
				break;
			
		}
				
		
		System.out.println("Current Status Code means: "+HTTP_STATUS_CODE+"\t"+desc);
		
	}
	
	public static void testSwitchChar(final char myGrade) {
		char GRADE = myGrade;
				
		String desc = "unknown";
		
		
		switch(GRADE) {
			case 'A':
				desc = "Congradulations!";
				break;
			case 'B':
				desc = "Good job!";
				break;
			case 'C':
				desc = "Not bad!";
				break;
			case 'D':
				desc = "Keep working";
				break;
			case 'F':
				desc = "Try another time!";
				break;
			default:
				break;
			
		}
				
		
		System.out.println("You've got: "+GRADE+"\t"+desc);
		
	}
	
	
	public static void testSwitchString() {
		final String ROBOT_COMMAND = "forward";
				
		String desc = "standby";
		
		
		switch(ROBOT_COMMAND) {
			case "forward":
				desc = "forward done";
				break;
			case "backward":
				desc = "backward done";
				break;
			case "rotate":
				desc = "rotate done";
				break;
			case "detect":
				desc = "detect done";
				break;
			case "stop":
				desc = "stop done";
				break;
			default:
				break;
			
		}
				
		
		System.out.println("Robot command recieved. \t"+desc);
		
	}
	
}
