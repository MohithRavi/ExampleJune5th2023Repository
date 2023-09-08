package com.sgtesting.stringdemo;

public class StringDemo1 {


	public static void main(String[] args) {
		extractstring();
	}
     private static void extractstring() {
    	 String s = "welcome";
    	 String s1 = s.substring(3);
    	 System.out.println("From position : " +s1);
    	 String s2 = s.substring(3, 6);
    	 System.out.println("From range :" +s2);
     }


	}


