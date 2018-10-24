package program_base;

import java.util.Scanner;
/*
 * 需求:输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。  
 */
public class Statistics_character {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		int eng=0;//字母
		int num=0;//数字
		int spa=0;//空格
		int oth=0;//其他
		
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
		
		System.out.println("中英文字符数为："+eng);
		System.out.println("数字数为："+num);
		System.out.println("空格数为："+spa);
		System.out.println("其他字符数为："+oth);
	}
}
