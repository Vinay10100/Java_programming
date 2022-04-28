package Assignment_01;


import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Arthmetic obj = new Arthmetic();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		float res;
		res = a > b ? obj.sum(a, b) : obj.sub(a, b);
		System.out.println("\n Result is: " + res);
	}

}

class Arthmetic {

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