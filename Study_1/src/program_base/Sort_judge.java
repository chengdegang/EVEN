package program_base;

import java.util.Scanner;

/*
 * 需求：输入三个整数，请把这三个数由小到大输出。 
 */
public class Sort_judge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int input3 = in.nextInt();
		in.close();

		if (input1 > input2) {
			if (input1 > input3) {
				if (input2 > input3) {
					System.out.println(input1 + ">" + input2 + ">" + input3);
				} else {
					System.out.println(input1 + ">" + input3 + ">" + input2);
				}
			} else {
				System.out.println(input3 + ">" + input1 + ">" + input2);
			}
		} else {
			if (input2 < input3) {
				System.out.println(input3 + ">" + input2 + ">" + input1);
			} else if (input1 > input3) {
				System.out.println(input2 + ">" + input1 + ">" + input3);
			} else {
				System.out.println(input2 + ">" + input3 + ">" + input1);
			}
		}
	}

}
