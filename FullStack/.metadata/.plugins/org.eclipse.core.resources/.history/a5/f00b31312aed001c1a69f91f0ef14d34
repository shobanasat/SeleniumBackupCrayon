package Examples;

public class Variables {
	
	//This is a instance variable of class Variables. You can add and remove static to understand the difference
	//between static and instance variable
	public int b = 10;
	
/*	public Variables() {
		this.b=20;
	}*/

	public static void main(String[] args) {

		//Declaring local variable
		int a = 123;
		System.out.println(a);
		
		//Create object for constructor class and use the Instance variable
		Variables i = new Variables();
//		System.out.println(i.b);
		i.b = i.b + 10;
		System.out.println(i.b);
		instance();
		
		Variables2 j = new Variables2();
		j.add();
		System.out.println("Member variable. Declared in Variables2 and printed in Variables1 " + j.a);
		j.sub();
		j.loop();
	}
// local variable a cannot be used outside main block
//	System.out.println(a); - this will fail
	
	public static void instance() {
		
		Variables j = new Variables();
		System.out.println(j.b);
	}
}
