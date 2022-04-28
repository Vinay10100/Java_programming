package Assignment_01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee obj[] = new Employee[8];
		System.out.println("Enter details of employees:");
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter details of employee " + (i + 1) + ":");
			obj[i] = new Employee(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextLong());
		}
		sc.close();
		for (int i = 0; i < 7; i++) {
			for (int j = i + 1; j < 8; j++) {
				if (obj[i].department == obj[j].department) {
					obj[i].calculate(obj[j]);
				}

			}
			obj[i].display();
		}
	}

}

class Employee {
	String name;
	int age;
	char department;
	long salary = 0;

	Employee(String a, int b, char c, long d) {
		name = a;
		age = b;
		department = c;
		salary = d;
	}

	void calculate(Employee obj) {

		if (salary + obj.salary > 30000) {
			salary += 25000;
		} else
			salary += obj.salary;
	}

	void display() {
		System.out.println("Total salary for to be paid to department " + department + "is " + salary);
	}

}