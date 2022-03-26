package unit_01;

//  Piece of data/code that would never change

public class P2_Task02_ConstantsInJava {

	private static final double Pi =3.14;
	
	public static void main(String[] args) {
	
		final int a=10;
		//a=11;
		//Cannot make a static reference to the non-static field Pi
		System.out.println(Pi);
		
		System.out.println(a);
		
		//Cannot make a static reference to the non-static method add(int, int) from
		//the type P2_Task02_ConstantsInJava
		add(1, 2);
		
		multi(1, 2);
		
		Calculator obj = new Calculator();
		System.out.println(obj.add(1,2));
		System.out.println(obj.a);
		
	}

	static int add(int a, int b) {
		
		//sysout[ctrl+space bar]
		System.out.println(a);
			
		System.out.println(Pi);
			
		return (a + b);
			
		}
	
	static int multi(int a, int b) {
			return (a * b);
		}
		
}
class Calculator {
	
	int a = 10;
	
	int add(int a, int b) {
		
		//System.out.println(Pi);
		
		return (a + b);
	}
	
	int multi(int a, int b) {
		return (a * b);
	}
}