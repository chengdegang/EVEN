package cdg;

public class Student extends People{
	Student(String name){
		super(name);
	}
    void read() {
    	System.out.println("reading");
    }
    
    void age(int age) {
    	System.out.println("½ñÄê"+age+"Ëê");
    }
}
