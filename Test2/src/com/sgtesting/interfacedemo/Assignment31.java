package com.sgtesting.interfacedemo;
interface College11{
	void showcollegename(String name);
}
interface student11 {
	abstract void showstudentname (String name);
}
abstract class university11{
	abstract void showuniversityname(String name);
}
 
class staff extends university11 implements College11,student11{
	public void showcollegename(String name) {
		System.out.println("College name :" +name);
	}
	
	public void showstudentname (String name) {
		System.out.println("Student name :" +name);
	}
	void showuniversityname(String name) {
		System.out.println("Name of the University :" +name);
	}
}

public class Assignment31 {

	public static void main(String[] args) {
		staff o1 = new staff();
		o1.showcollegename("NIE College of Engineering");
		o1.showstudentname("Mohith");
		o1.showuniversityname("VTU Belagavi");

	}

}
