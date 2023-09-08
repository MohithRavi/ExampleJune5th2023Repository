package com.randomexamples;

class Person{
	String firstname;
	int age;
	String Lastname;
}

class Birds{
	String Birdname;
	int nooffeathers;
}

public class ClassDemo {
	
public static void main(String[] args) {
	Person o1 = new Person();
	o1.firstname = "santosh";
	o1.age = 77;
	o1.Lastname = "Mohan";
	System.out.println("Firstname =" +o1.firstname);
	System.out.println("Lastname =" +o1.Lastname);
	System.out.println("Age =" +o1.age);
	Birds o2 = new Birds();
	System.out.println("Birdname =" +"Peacock");
	System.out.println("No of Feathers =" +"43");
	
}
}
