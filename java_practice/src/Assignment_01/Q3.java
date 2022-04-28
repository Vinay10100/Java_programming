package Assignment_01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		testClass obj = new testClass();
		System.out.println("\n Enter the integer:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		obj.display(a);
		sc.close();
	}

}

interface in1 {
	void display();
}

class testClass {
	public void display(int p) {
		int i = 2;
		int check = 0;
		while (i < p) {
			if (p % i == 0)
				check = 1;
			i++;
		}
		if (check == 0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");

	}
}