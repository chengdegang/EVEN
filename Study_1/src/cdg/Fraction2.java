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
	//将分数转换城double
    double toDouble() {
		
    	return 0;
	}
	//将自己的分数和 r 的分数相加，产生一个新的 Fraction 的对象
	Fraction plus(Fraction r) {
		
		return new Fraction(1,2);
	}
	//将自己的分数和 r 的分数相乘，产生一个新的 Fraction 的对象
	Fraction multiply(Fraction r) {
		
		return new Fraction(1,2);
	}
	//将自己以“分子/分母”的形式输出到标准输出，并带有回车换行
	void print() {
		
	}
}