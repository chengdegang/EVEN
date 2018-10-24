package cdg;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  //测试方法调用
//	 People b =new People("test1");
//     b.walk();
//	 doctor a=new doctor("123");
//	 a.operate();
//	 a.talk();
	 
	 //测试数组无需初始化
//	 int[] anar =new int[5];
//	 System.out.println(anar[0]);
	  
     /* 最大公约数计算
     Scanner in = new Scanner(System.in);
	 int a=in.nextInt();
	 int b=in.nextInt();
	 SuanShu math=new SuanShu(a,b);
	 in.close();
	 System.out.println(math.gy());
	 */
	  
	  //测试math函数
//	  String l = String.valueOf(Math.random());
//	  System.out.println(l);
//	  String endNo = l.toString();
//	  System.out.println(endNo);
	  
	  //测试toString方法
//	  int a = 666;
//	  System.out.println(Integer.toString(a));
	  
	  //测试 "==" "equals"
	  Integer n1 = 47;
	  Integer n2 = 47;
	  String s1 = "hello";
	  String s2 = "hello";
//	  String s3 = new String("hello");
//	  String s4 = new String("hello");
//	  System.out.println(n1==n2);
//	  System.out.println(n1.equals(n2));
	  System.out.println(s1==s2);
//	  s2=s2.replace('c','o');
	  s2=new String("hello");
//	  s2="hello";
	  System.out.println(s2==s1);
//	  System.out.println(s3==s4);
//	  System.out.println(s1.equals(s3));
	  
	  //测试输入
//	  Scanner a = new Scanner(System.in);
//	  String b = a.nextLine();
//	  System.out.println(b);
	  
	  //cloud_address

String type = "1";
String organization = "杭州市西斗门路X号";
String param ="{\"type\":\""+type+"\",\"dataList\": [{\"metadata\": {\"type\": \"A1\"},\"organization\": \""+organization+"\"}]}";
	  System.out.println(param);
}
}
