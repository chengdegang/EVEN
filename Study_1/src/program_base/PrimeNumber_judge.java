package program_base;
/*
 * ����:�ж�101-200֮���ж��ٸ���������������������� 
 */
public class PrimeNumber_judge {
	public static void main(String[] args) {
		//�����������,aΪ����,cΪ��������,dΪͳ�������ĸ���
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
		System.out.println("һ���У�"+d+"������");
	}
}
