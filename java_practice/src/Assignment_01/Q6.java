package Assignment_01;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {

		Arithmetic obj = new Arithmetic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		float res;
		res = a > b ? obj.sum(a, b) : obj.sub(a, b);
		System.out.println("Result is: " + res);
	}

}

class Arithmetic {

	float sub(float a, float b) {
		if (a < b)
			return 0;
		else
			return a - b;
	}

	float sum(float a, float b) {
		return a + b;
	}

}