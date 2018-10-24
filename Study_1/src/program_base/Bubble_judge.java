package program_base;

import java.util.Scanner;

/*
 * 需求：输入数组，将数组进行冒泡排序
 */
public class Bubble_judge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.println("Put the number to define array length:");
		a = in.nextInt();
		
		int[] num = new int[a];
		System.out.println("Put the array:");
		for(int i=0;i<num.length;i++) {
			num[i]=in.nextInt();
		}
		in.close();
		
		int temp;
		
		for (int i = 0; i < num.length - 1; ++i) {
            for (int j = num.length - 1; j > i; --j) {
                if (num[j] < num[j - 1]) {
                    temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
    
		System.out.println("Result:");
		for(int l=0;l<num.length;l++) {
			System.out.println(num[l]);	
		}
	}
}


