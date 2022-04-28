package Assignment_01;

public class Q7 {

	public static void main(String[] args) {
		Employee1 obj1 = new Employee1();
		Employee1 obj2 = new Employee1();
		Employee1 obj3 = new Employee1();
		Employee1 obj4 = new Employee1();
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
		System.out.println("Total number of function calls: " + obj1.count);
		System.out.println("Total number of objects created: " + obj1.count);
	}

}

class Employee1 {
	static int count = 0;

	void display() {
		count++;
	}
}