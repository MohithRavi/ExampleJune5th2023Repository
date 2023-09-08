package com.sgtesting.stringdemo;

public class Assignment4 {

	public static void main(String[] args) {
		String s1 = "the temple is at the top of the hill";
		int count = 0;
		char ch[] = s1.toCharArray();
		for(char c : ch) {
			count++;
		}
System.out.println(count);
	}

}
 