package cdg;

public class Extends_test2 extends Base2 {
	
	public static void main(String[] args) {
		Extends_test2 m =new Extends_test2(10);
	}
	
	Extends_test2(int i){
		super(i);
	}
	
	Extends_test2(String s,int i){
		this(i);
		Base2 b =new Base2(10);
	}
}

class Base2{
	public Base2(int i) {
		
	}
}