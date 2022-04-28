package Assignment_01;

public class Q4 {

	public static void main(String[] args) {
		Three obj = new Three(1);
		Three obj1 = new Three();
	}

}

class One {
	One(int x) {
		System.out.println("Inside class One");
	}

}

class Two extends One {
	Two() {
		super(1);
		System.out.println("Inside class Two");
	}
}

class Three extends Two {
	Three() {
		System.out.println("Inside class Three");
	}

	Three(int y)
	{
		System.out.println("Inside class Three");
	}
	}
