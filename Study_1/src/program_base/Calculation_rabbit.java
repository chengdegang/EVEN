package program_base;

/*
 * 需求:有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Calculation_rabbit {
	public static void main(String[] args) {
		//i为月份，第一个月i为0
		int i;
		int list[] = new int[24];
		list[0]=list[1]=1;
		System.out.println("第1个月的兔子为1对，数量为2");
		System.out.println("第2个月的兔子为1对，数量为2");
		for(i=2;i<24;i++) {
			list[i] =list[i-1]+list[i-2];
			System.out.println("第"+(i+1)+"个月的兔子为"+list[i]+"对"+"，数量为"+2*list[i]);
		}
	}
}
