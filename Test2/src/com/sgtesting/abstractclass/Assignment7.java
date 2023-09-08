package com.sgtesting.abstractclass;
abstract class college7{
	abstract void showcollegename(String name);
	abstract void displaycityname(String name);
}

class Enggclg8 extends college7{
	
	void showcollegename(String name) {
		System.out.println("College name: " +name);
	}
	void displaycityname(String name) {
		System.out.println("City of college :" +name);
	}
}


class Enggclg9 extends Enggclg8{
	void ranking(int rno) {
		System.out.println("All India ranking :" +rno);
	}
	
	class Enggclg7 extends college7{
		void showcollegename(String name) {
			System.out.println("College name: " +name);
		}
		void displaycityname(String name) {
			System.out.println("City of college :" +name);
		}
		
	}
	
}

public class Assignment7 {

	public static void main(String[] args) {
		Enggclg7 o1 = new Enggclg7();
		o1.displaycityname("raichur");
		o1.ranking(24);
		o1.showcollegename("NIE College of Engineering");
		Enggclg9 o2= new Enggclg9();
		o2.displaycityname("Mysore");
		o2.ranking(10);
		o2.showcollegename("JSS college of Engineering");

	}

}
