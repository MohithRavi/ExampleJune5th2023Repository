package com.sgtesting.abstractclass;

abstract class college{
	abstract void showcollegename(String name);
	abstract void displaycityname(String name);
	void Showbranches(String branches[]) {
		//System.out.println("Branch Names" );
		for(int i=0;i<branches.length;i++) {
			System.out.println(branches[i]);
		}
	}
}
class Engineering extends college{
	void showcollegename(String name) {
		System.out.println("Engineering college name :"+name);
	}
	
	void displaycityname(String name) {
		System.out.println("City :" +name);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Engineering o1 = new Engineering();
		o1.displaycityname("Raichur");
		o1.showcollegename("jss");
		String s[] = {"civil","Mechanical"};
		o1.Showbranches(s);
	}

}
