package Assignment_01;

public class Q9 {

	public static void main(String[] args) {
		XYZ obj = new XYZ();
		obj.showData();
		obj.accessData();

	}

}

class ABC {

	int a = 10;

	public int b = 20;
	protected int c = 30;
	private int d = 40;

	void showData() {
		System.out.println("Inside class ABC");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}
}

class XYZ extends ABC {

	void accessData() {
		System.out.println("Inside class XYZ");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

	}
}