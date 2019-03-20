package com.athensoft.session1.basics.activity6;

/**
 * Activity 6 - Special Floating Values
 * @author ildmost
 *
 */
public class FloatingValue {

	public static void main(String[] args) {
		
		//NaN
		float a = 0.0f;
		System.out.println(a/a);
		
		//Positive Infinity
		float fpi = Float.POSITIVE_INFINITY;
		System.out.println("fpi="+fpi);
		
		//Negative Infinity
		float fni = Float.NEGATIVE_INFINITY;
		System.out.println("fni="+fni);
		
		//Positive Infinity
		double dpi = Double.POSITIVE_INFINITY;
		System.out.println("dpi="+dpi);
		
		//Negative Infinity
		double dni = Double.NEGATIVE_INFINITY;
		System.out.println("dni="+dni);

	}

}
