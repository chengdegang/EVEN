package cdg;

import java.util.HashMap;
import java.util.HashSet;

public class Test_Value {

	    int i;
		public boolean equals(Test_Value v) {
			return v.i==i;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Test_Value> set =new HashSet<Test_Value>();
        Test_Value v1=new Test_Value();
        Test_Value v2=new Test_Value();
        Test_Value v3=new Test_Value();
//        v1.i=v2.i=39;
        set.add(v1);
        set.add(v2);
        set.add(v3);
        System.out.println(set.size());
	}

}
