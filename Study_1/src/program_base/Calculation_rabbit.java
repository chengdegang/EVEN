package program_base;

/*
 * ����:��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ
�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 */
public class Calculation_rabbit {
	public static void main(String[] args) {
		//iΪ�·ݣ���һ����iΪ0
		int i;
		int list[] = new int[24];
		list[0]=list[1]=1;
		System.out.println("��1���µ�����Ϊ1�ԣ�����Ϊ2");
		System.out.println("��2���µ�����Ϊ1�ԣ�����Ϊ2");
		for(i=2;i<24;i++) {
			list[i] =list[i-1]+list[i-2];
			System.out.println("��"+(i+1)+"���µ�����Ϊ"+list[i]+"��"+"������Ϊ"+2*list[i]);
		}
	}
}
