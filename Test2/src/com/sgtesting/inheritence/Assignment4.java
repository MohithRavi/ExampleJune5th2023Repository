package com.sgtesting.inheritence;
class inheritence1{
	inheritence1(int age){
		System.out.println("Age of a Person :" +age);
	}
}
class inheritence2 extends inheritence1{
	inheritence2(int age,int libno){
		super (age);
		System.out.println("Librery number of a person" +libno);
	}
	
}
class inheritence3 extends inheritence2{
	inheritence3(int age, int libno,int call){
		super(age,libno);
		System.out.println("Contact Number" +call);
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		//inheritence2 o1 = new inheritence2(23,34);
		inheritence3 o2 = new inheritence3(23,12,3456);
		

	}

}
