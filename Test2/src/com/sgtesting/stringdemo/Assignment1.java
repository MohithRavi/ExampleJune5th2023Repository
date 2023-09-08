package com.sgtesting.stringdemo;

public class Assignment1 {

	public static void main(String[] args) {
	 
		String s = "Banglore and Mysore";
		String str[] = s.split(" ");
		for(int i =str.length-1; i>=0;i--) {
			System.out.print(str[i]+ " ");
		}

	}
}
