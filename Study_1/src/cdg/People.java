package cdg;

public class People {
    private  String name;
	void walk() {
		System.out.println("walking");
	}
	
	void age(int age) {
		System.out.println(name+"½ñÄê"+age+"Ëê¡£");
	}
	
	People(String name) {
		setName(name);
	}
	
	People() {
		
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void talk() {
		System.out.println("my name is:"+name);
	}
	
	String getname() {
		return name;
	}
}
