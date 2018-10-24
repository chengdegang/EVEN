package cdg;

public class TestPrivate {

	private int i = f();
	private int j = 10;
	private int f() {
		return j;
	}

	public static void main(String[] args) {
		System.out.println(new TestPrivate().i);
	}
}
