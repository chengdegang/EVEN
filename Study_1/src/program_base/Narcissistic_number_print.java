package program_base;
/*
 * 需求：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
 */

public class Narcissistic_number_print {

	public static void main(String[] args) {
		int i,sum;
		sum = 0;
		//a,b,c分别代表百位十位个位
		int a,b,c;
		for(i=100;i<=999;i++) {
			a=i/100;
			b=(i-a*100)/10;
			c=i-a*100-b*10;
			sum=a*a*a+b*b*b+c*c*c;
			if(i==sum) {
				System.out.println(i);
			}
		}
	}

}
