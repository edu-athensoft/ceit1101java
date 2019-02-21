package com.athensoft.session4.oop.activity3;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Activity 3 - interface and callback
 * @author Athens
 *
 */
public class TimerTest {
	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();

		// construct a timer that calls the listener
		// once every seconds
		Timer t = new Timer(1000, listener);	//pass an object
		t.start();

		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}