package cdg;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  //���Է�������
//	 People b =new People("test1");
//     b.walk();
//	 doctor a=new doctor("123");
//	 a.operate();
//	 a.talk();
	 
	 //�������������ʼ��
//	 int[] anar =new int[5];
//	 System.out.println(anar[0]);
	  
     /* ���Լ������
     Scanner in = new Scanner(System.in);
	 int a=in.nextInt();
	 int b=in.nextInt();
	 SuanShu math=new SuanShu(a,b);
	 in.close();
	 System.out.println(math.gy());
	 */
	  
	  //����math����
//	  String l = String.valueOf(Math.random());
//	  System.out.println(l);
//	  String endNo = l.toString();
//	  System.out.println(endNo);
	  
	  //����toString����
//	  int a = 666;
//	  System.out.println(Integer.toString(a));
	  
	  //���� "==" "equals"
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
	  
	  //��������
//	  Scanner a = new Scanner(System.in);
//	  String b = a.nextLine();
//	  System.out.println(b);
	  
	  //cloud_address

String type = "1";
String organization = "������������·X��";
String param ="{\"type\":\""+type+"\",\"dataList\": [{\"metadata\": {\"type\": \"A1\"},\"organization\": \""+organization+"\"}]}";
	  System.out.println(param);
}
}
