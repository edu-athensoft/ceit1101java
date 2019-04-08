package com.athensoft.session1.basics.activity20;

/**
 * Activity 20 - if structure and branching
 * @author Athens
 *
 */
public class MyIf {

	public static void main(String[] args) {
		testIf();
		
		testIfElse();
		
		testIfElseIf(90);
		
		testNestedIf();

	}
	
	//if
	public static void testIf() {
		boolean isSunny = true;
		boolean hasSnow = true;
		
		//one statement
		if(isSunny) System.out.println("Let's go out.");
		
		//multi-statement or in a block
		if(isSunny && hasSnow) {
			System.out.println("Let's go out for skating.");
			System.out.println("Why not?");
		}
		
	}
	
	
	//if-else
	public static void testIfElse() {
		boolean isSunny = false;
		boolean hasSnow = true;
		
		if(isSunny && hasSnow) {
			System.out.println("Let's go out for skating");
		}else {
			System.out.println("Let's stay at home and play video games");
		}
	}
	
	
	//if-else-if
	public static void testIfElseIf(final int myScore) {
		int score = myScore;
		
		String grade = "N/A";
		
		if(score < 60) {
			grade = "F";
		}else if (score >= 60 && score <70) {
			grade = "D";
		}else if (score >= 70 && score <80) {
			grade = "C";
		}else if (score >= 80 && score <90) {
			grade = "B";
		}else {
			grade = "A";
		}
		
		System.out.println("Your grade is "+grade);
		
	}
	
	
	//nested-if
	public static void testNestedIf() {
		boolean isSunny = false;
		boolean hasSnow = true;
		
		if(isSunny) {
			if(hasSnow) {
				System.out.println("Let's go out for skating.");
			}else {
				System.out.println("Let's go out for soccer.");
			}
			
		}else {
			System.out.println("Let's stay at home and play video games.");
		}
	}

}
