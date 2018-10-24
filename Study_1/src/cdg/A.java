package cdg;

public class A {
	public int v1 = 1;

	A() {
		print();
	}

	public void print() {
		System.out.println("v1 from A:" + v1);
	}

	public static void main(String[] args) {
		B b = new B();
		A a= new A();
	}
}

class B extends A {
	public int v1 = 2;
	
	B(){
		
	}

	public void print() {
		System.out.println("v1 from B:" + v1);
	}
}
