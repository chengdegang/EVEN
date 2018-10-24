package cdg;

public class doctor extends People{
	doctor(String name){
		super(name);
	}

	void operate() {
		System.out.println(getname()+" Operate now£¡");
	}
}
