package com.athensoft.session4.oop.activity4;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LocalInnerTest {
	public static void main(String[] args) {
		TalkingClock1 clock = new TalkingClock1();
		clock.start(1000, true);

		// keep program running until user selects "Ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}


/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock1 {
	
//	private int interval;
//	private boolean beep;
	
	/**
	 * Constructs a talking clock
	 * 
	 * @param interval the interval between messages (in milliseconds)
	 * @param beep     true if the clock should beep
	 */
//	public TalkingClock1(int interval, boolean beep) {
//		this.interval = interval;
//		this.beep = beep;
//	}

	/**
	 * Starts the clock.
	 */
	public void start(int interval, final boolean beep) { 
		
		/**
		 * local inner class
		 * access local variable
		 * @author Athens
		 *
		 */
		class TimePrinter implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep)		//access the field of outer class
					Toolkit.getDefaultToolkit().beep();
			}
		}
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}

	
}