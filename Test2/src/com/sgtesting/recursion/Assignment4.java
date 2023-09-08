package com.sgtesting.recursion;
class oddnum1{
	int count = 51;
	void oddnumber() {

		if(count >=21) {
			if(count%2==0) {
				System.out.println(count);
			}
			count = count-1;
			oddnumber();
		}	
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		oddnum1 o1 = new oddnum1();
		o1.oddnumber();

	}

}
