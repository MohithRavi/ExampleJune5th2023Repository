package com.sgtesting.inheritence;
class Inheritence6{
	Inheritence6(int age){
		System.out.println("age of " +age);
	}
	
	Inheritence6(String Name){
		System.out.println("name of " +Name);
	}
}

class Inheritence8 extends Inheritence6{
	Inheritence8(int age){
		super (age);
				
	}
	Inheritence8(String Name){
		super(Name);
	}
	
}

public class Assignment5 {

	public static void main(String[] args) {
		Inheritence8 o3 = new Inheritence8(23);
		Inheritence8 o4 = new Inheritence8("Mohith");
	

	}

}
