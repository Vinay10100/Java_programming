package unit_02;

/*
Abstract Class:
- An abstract class must be declared with an abstract keyword.

- Abstraction is a process of hiding the implementation details and showing only
  functionality(function declarations) to the is user.

- Can not make the object of abstract class directly, but through derived class[can not be instantiated]

- Example of abstract method?
- Abstract class may contain abstract and non-abstract methods
- (0-100%) abstract methods can be there!

- In case of Interface: 100% abstract methods should be there!

Final class:
- The main purpose of using a class being declared as final is to prevent the class from being inherit
- If a class is marked as final then no class can inherit any feature of the final class.
- You cannot extend a final class. If you try it gives you a compile time error. 

 */

abstract class Bike {
	int a;

	Bike() {
		System.out.println("Inside Bike constructor:" + a + "\n");
	}

	abstract void run(); // abstract method! (0-100)

	void display() {
		System.out.println("This is displayed method");
	}
}

class Honda4 extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub

	}

}

public class P10_Task02_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj = new Honda4();
		// obj.run();
		obj.display();

		// can not be instantiated
		// Bike obj2=new Bike();
	}
}

//Final Class
final class Super {

	public int data = 30;

	void display() {
		System.out.println(data);
	}
}
/*
 * public class Sub extends Super { void display2() { display(); } }
 */