package cdg;

public class Extencd_test extends Base {

	void f(String s) {
		System.out.println("String");
	}

	public static void main(String args[]) {
		Extencd_test a = new Extencd_test();
		a.f(10);
	}
}

class Base {
	void f(int i) {
		System.out.println("int");
	}

	void f(double d) {
		System.out.println("double");
	}
}
