package program_base;

import java.util.Scanner;
/*
 * ����:����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����  
 */
public class Statistics_character {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		int eng=0;//��ĸ
		int num=0;//����
		int spa=0;//�ո�
		int oth=0;//����
		
		char[] str = input.toCharArray();
		for(int i=0;i<str.length;i++) {
			if(Character.isLetter(str[i])) {
				eng++;
			}
			else if(Character.isDigit(str[i])) {
				num++;
			}
			else if(Character.isSpaceChar(str[i])) {
				spa++;
			}
			else  {
				oth++;
			}
		}
		
		System.out.println("��Ӣ���ַ���Ϊ��"+eng);
		System.out.println("������Ϊ��"+num);
		System.out.println("�ո���Ϊ��"+spa);
		System.out.println("�����ַ���Ϊ��"+oth);
	}
}
