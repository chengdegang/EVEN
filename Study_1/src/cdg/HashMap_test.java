package cdg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashMap_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(2, "test3");
        
        System.out.println("put number what u want: ");
        Scanner b= new Scanner(System.in);
        int i= b.nextInt();
        
        if (i>map.size()) {
        	System.out.println("ָ����ȡ��mapֵΪ: "+"����map��Χ");
        	b.close();
        	return;
        }
        
        b.close();
        System.out.println("ָ����ȡ��mapֵΪ: "+map.get(i));
        System.out.println("map������СΪ�� "+map.size());
        
        HashSet<String> map2=new HashSet<String>();
        map2.add("test3");
        map2.add("test3");
        System.out.println("map2������СΪ�� "+map2.size());
        
	}

}
