package com.sgtesting.inheritence;

class College{
	void student(int rollno, String name){
		System.out.println("Roll no :" +rollno);
		System.out.println("Name of the :" +name);
	}
}
class University extends College{
	void uniname(String name, int unino) {
		System.out.println("University name :" +name);
		System.out.println("University registration no :" +unino);
	}
}
class Library extends University{
	void libname(int libno, String name) {
		System.out.println("Library number :" +libno);
		System.out.println("Library name :" +name);
	}
}
class Library2 extends College{
	void libname(int libno, String name) {
		System.out.println("Library number2 :" +libno);
		System.out.println("Library name2 :" +name);
	}
}


public class Practice3 {

	public static void main(String[] args) {
		Library o1 = new Library();
		o1.student(20, "Mohith");
		
		o1.libname(23,"saraswathi Library");
	o1.uniname("VTU", 2345);
		Library2 o2 = new Library2();
		o2.student(20, "Mohith");
		
		o2.libname(23,"saraswathi Library");
		
		

	}

}
