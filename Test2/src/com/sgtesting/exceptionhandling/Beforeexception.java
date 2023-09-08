package com.sgtesting.exceptionhandling;
class Basicmaths{
	static void addition(int x,int y) {
		int res =(x+y);
		System.out.println(+res);
	}
	static void subtraction(int x,int y) {
		int res =(x-y);
		System.out.println(+res);
	}
	static void multiplication(int x,int y) {
		int res =(x*y);
		System.out.println(+res);
	}
	
	//static void Division(int x,int y) {
		//int res =(x/y);
		//System.out.println(+res);
	//}
	
	static void division(int x,int y) {
		try {
			int res =(x/y);
			System.out.println(+res);
		}catch(Exception t){
		   System.out.println(t);
		}
	}
	
	static void modulous(int x,int y) {
		int res =(x%y);
		System.out.println(+res);
	}
	static void even(int x) {
		if (x%2==0) {
			System.out.println("even");
		}
	}

	static void odd(int x) {
		if (x%2!=0) {
			System.out.println("odd");
		}

	}
}

public class Beforeexception {

	public static void main(String[] args) {
		Basicmaths.addition(10, 10);
		Basicmaths.division(13, 0);
		Basicmaths.even(23);
		Basicmaths.modulous(12, 6);
		Basicmaths.multiplication(23, 2);
		Basicmaths.odd(45);
		Basicmaths.subtraction(23, 4);

	}

}
