package com.sgtesting.interfacedemo;
interface College12{
	void showcollegename(String name);
}
interface student12 extends College12{
	abstract void showstudentname (String name);
}
interface university12 extends student12{
	void showuniversityname(String name);
}

class whole implements College12,student12,university12{
	public void showcollegename(String name) {
		System.out.println("College name :" +name);
	}

	public void showstudentname (String name) {
		System.out.println("Student :" +name);
	}


	public void showuniversityname(String name) {
		System.out.println("University name :" +name);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
        whole o1 = new whole();
        o1.showcollegename("NIE College of Engineering");
        o1.showstudentname("Mohith");
        o1.showuniversityname("VTU Belagavi");

	}

}
