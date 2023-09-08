package com.sgtesting.abstractclass;

abstract class college6{
	abstract void showcollegename(String name);
	abstract void displaycityname(String name);
}

class Enggclg6 extends college6{
	
	void showcollegename(String name) {
		System.out.println("College name: " +name);
	}
	void displaycityname(String name) {
		System.out.println("City of college :" +name);
	}
}


class Enggclg7 extends Enggclg6{
	void ranking(int rno) {
		System.out.println("All India ranking :" +rno);
	}
	
}
public class Assignment6 {

	public static void main(String[] args) {
    Enggclg7 o1=new Enggclg7();
    o1.displaycityname("Mysore");
    o1.ranking(24);
    o1.showcollegename("NIE college of Engineering");

	}

}
