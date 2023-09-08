package com.sgtesting.abstractclass;
abstract class college5{
	abstract void showcollegename(String name);
	abstract void displaycityname(String name);
}
class student extends college5{
	void showcollegename(String name) {
		System.out.println(name);
	}
	void displaycityname(String name) {
		System.out.println(name);
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		
       student o1 = new student();
       o1.displaycityname("Mysore");
       o1.showcollegename("NIE College of Engineering");
	

}
}
