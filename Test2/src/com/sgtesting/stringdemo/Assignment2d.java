package com.sgtesting.stringdemo;

public class Assignment2d {
	public static void main(String[] args) {
		String s = "WELCOME";
		int l = s.length();
		System.out.println(l);
		for(int i=0; i<l; i++) {
			System.out.println (s.substring(0, i+1));
			}
		for(int i=l; i>=0; i--) {
			System.out.println (s.substring(0, i));
			}

	}


}


