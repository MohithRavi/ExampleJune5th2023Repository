package com.sgtesting.recursion;
class evennum{
	int count = 40;
	void evennumber() {

		if(count <=60) {
			if(count%2==0) {
				System.out.println(count);
			}
			count = count+1;
			evennumber();
		}	



	}

}



public class Assignment1 {

	public static void main(String[] args) {
		evennum o1 = new evennum();
		o1.evennumber();


	}

}
