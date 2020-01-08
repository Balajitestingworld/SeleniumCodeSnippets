package testNG;

class Master {

	public void display() {
		System.out.println("Master display");
	}
}

public class Intro extends Master {
	
//	Annotations give additional information
	@Override
	public void display() {
		System.out.println("Intro display");
	}

	public static void main(String[] args) {
		Intro i = new Intro();
		Master m = new Master();
		Master m1 = new Intro();
		i.display();
	}
}



