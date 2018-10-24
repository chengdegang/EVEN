package program_base;
/*
 * 需求:判断101-200之间有多少个素数，并输出所有素数。 
 */
public class PrimeNumber_judge {
	public static void main(String[] args) {
		//定义所需参数,a为除数,c为除数因子,d为统计素数的个数
		int i,a,b,c,d;
		c=0;
		d=0;
		for(i=1;i<=100;i++) {
			for(a=1;a<=i;a++) {
				b = i%a;
				if(b==0) {
					c++;
				}		
			}
			if(c==2) {
				System.out.println(i);
				d++;
			}
			c=0;
		}
		System.out.println("一共有："+d+"个素数");
	}
}
