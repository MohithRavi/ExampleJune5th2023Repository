package com.sgtesting.abstractclass;
abstract class college3{
	static {
		System.out.println("My name is Mohith");
	}
	
	static {
		System.out.println("My hobbies is to read books");
	}
}

class hobbies extends college3{
	
}
public class Assignment4 {

	public static void main(String[] args) {
		hobbies o1 =new hobbies();

	}

}
