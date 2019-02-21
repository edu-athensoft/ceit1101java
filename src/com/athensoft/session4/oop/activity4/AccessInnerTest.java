package com.athensoft.session4.oop.activity4;

public class AccessInnerTest {

	public static void main(String[] args) {
		TalkingClock tc = new TalkingClock(1000,true);
		
		TalkingClock.TimePrinter tp = tc.new TimePrinter();	//how to create
		
		tp.testFoo();
	}

}
