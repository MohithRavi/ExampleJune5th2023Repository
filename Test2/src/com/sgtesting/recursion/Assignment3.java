package com.sgtesting.recursion;
class oddnum{
	int count = 71;
	void oddnumber() {

		if(count <=91) {
			if(count%2!=0) {
				System.out.println(count);
			}
			count = count+1;
			oddnumber();
		}	
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		oddnum o1 = new oddnum();
		o1.oddnumber();

	}

}
