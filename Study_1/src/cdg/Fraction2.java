package cdg;
import java.util.Scanner;

public class Fraction2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5, 6)).print();
		a.print();
		b.print();
		in.close();
	}
}

class Fraction {
	Fraction(int a,int b) {
		
	}
	//������ת����double
    double toDouble() {
		
    	return 0;
	}
	//���Լ��ķ����� r �ķ�����ӣ�����һ���µ� Fraction �Ķ���
	Fraction plus(Fraction r) {
		
		return new Fraction(1,2);
	}
	//���Լ��ķ����� r �ķ�����ˣ�����һ���µ� Fraction �Ķ���
	Fraction multiply(Fraction r) {
		
		return new Fraction(1,2);
	}
	//���Լ��ԡ�����/��ĸ������ʽ�������׼����������лس�����
	void print() {
		
	}
}