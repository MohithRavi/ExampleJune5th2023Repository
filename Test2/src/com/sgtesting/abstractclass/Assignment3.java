package com.sgtesting.abstractclass;
abstract class college2{
	void collegename(String name) {
		System.out.println("college name :" +name);
	}
	
	void studentname(String fn,int rollno) {
		System.out.println("Name of the Candidate: " +fn);
		System.out.println("Register number of the candiate: " +rollno);
	}
}

class Enggclg2 extends college2{
	
}

public class Assignment3 {

	public static void main(String[] args) {
		Enggclg2 o1 = new Enggclg2();
		o1.collegename("NIE college of engineering");
		o1.studentname("Mohith", 24);

	}

}
