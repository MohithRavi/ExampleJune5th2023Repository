package com.sgtesting.inheritence;
class Fruits{
	Fruits(int fno, String fname){
		System.out.println("fruit no :" +fno);
		System.out.println("fruit Name :" +fname);
	}
}
class Flower extends Fruits{
	Flower(int flno, String flname){
		super(flno,flname);
	} 
}
public class Practice5specialcase {

	public static void main(String[] args) {
		Flower o1 = new Flower(23,"orange");
		Flower o2 = new Flower(34,"Apple");
		
	}

}
