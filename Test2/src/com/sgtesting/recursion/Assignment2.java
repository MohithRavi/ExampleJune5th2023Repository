package com.sgtesting.recursion;
class evennum1{
	int count = 120;
	void evennumber() {

		if(count <=80) {
			if(count%2==0) {
				System.out.println(count);
			}
			count = count-1;
			evennumber();
		}	
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		evennum1 o1 = new evennum1();
		o1.evennumber();

	}

}
