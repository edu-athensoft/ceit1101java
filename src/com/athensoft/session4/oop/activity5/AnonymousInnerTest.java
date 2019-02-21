package com.athensoft.session4.oop.activity5;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AnonymousInnerTest {
	public static void main(String[] args) {
		TalkingClock2 clock = new TalkingClock2();
		clock.start(1000, true);

		// keep program running until user selects "Ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}


/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock2 {
	

	/**
	 * Starts the clock.
	 */
	public void start(int interval, final boolean beep) { 
		
		/**
		 * Anonymous inner class
		 * access local variable
		 * @author Athens
		 *
		 */
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep)		//access the field of outer class
					Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
	}

	
}