package com.athensoft.session2.test;

import java.util.Locale;

public class TestLocale {
	public static void main(String[] args) {
		Locale defaultLocale = Locale.getDefault();
		
		Locale currentLocale = new Locale("en","US");
		
		defaultLocale = currentLocale;
		
		String country = defaultLocale.getCountry(); //返回国家地区代码

		String language = defaultLocale.getLanguage(); //返回国家的语言

		String displayCountry = defaultLocale.getDisplayCountry(); //返回适合向用户显示的国家信息

		String displayLanaguage = defaultLocale.getDisplayLanguage(); //返回适合向用户展示的语言信息

		String displayName = defaultLocale.getDisplayName(); //返回适合向用户展示的语言环境名
		
		System.out.println(country);
		System.out.println(language);
		System.out.println(displayCountry);
		System.out.println(displayLanaguage);
		System.out.println(displayName);
		
		
		
		
	}
}
