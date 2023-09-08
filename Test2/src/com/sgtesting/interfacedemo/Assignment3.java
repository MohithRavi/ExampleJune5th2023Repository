package com.sgtesting.interfacedemo;
interface college{
	void showcollegename(String name);
}
interface student{
	abstract void showstudentname (String name);
}
class university implements student,college{
	public void showcollegename(String name) {
		System.out.println("college name :" +name);
		
	}
	
	public void showstudentname (String name) {
		System.out.println("Name of the stuednt :" +name);
	}
}
public class Assignment3 {

	public static void main(String[] args) {
    university o1 = new university();
    o1.showcollegename("NIE college of Engineering");
    o1.showstudentname("Mohith B.R");

	}

}
