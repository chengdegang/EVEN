package program_base;
/*
 * ���󣺴�ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
 */

public class Narcissistic_number_print {

	public static void main(String[] args) {
		int i,sum;
		sum = 0;
		//a,b,c�ֱ�����λʮλ��λ
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
