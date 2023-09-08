package com.sgtesting.abstractclass;
abstract class college1{
	abstract void showcollegename(String name);
	
	static void showbranche(String name ) {
		System.out.println("Branch Name :" +name);
	}
}

class EnggCollege extends college1{
	void showcollegename(String name) {
		System.out.println("College name :" +name);
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		EnggCollege o1 = new EnggCollege();
		o1.showcollegename("NIE college of Engineering");
		o1.showbranche("Civil");

	}

}
