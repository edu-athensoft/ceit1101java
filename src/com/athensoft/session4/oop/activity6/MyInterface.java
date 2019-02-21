package com.athensoft.session4.oop.activity6;

/**
 * A static inner class can be declared in an interface
 * @author Athens
 *
 */
public interface MyInterface {
	public static class Pair {
		/**
		 * Constructs a pair from two floating-point numbers
		 * 
		 * @param f the first number
		 * @param s the second number
		 */
		public Pair(double f, double s) {
			first = f;
			second = s;
		}

		/**
		 * Returns the first number of the pair
		 * 
		 * @return the first number
		 */
		public double getFirst() {
			return first;
		}

		/**
		 * Returns the second number of the pair
		 * 
		 * @return the second number
		 */
		public double getSecond() {
			return second;
		}

		private double first;
		private double second;
	}
}
