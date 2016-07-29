package sampleProj;

import java.util.Scanner;

public class PlusMinus {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		
		String str[] = sc.nextLine().split(" ");
		double pos = 0;
		double neg = 0;
		double zero = 0;
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(str[i]);
			if(num > 0) {
				pos++;
			}else if(num < 0) {
				neg++;
			}else {
				zero++;
			}
		}
		
		pos = pos/n;
		neg = neg/n;
		zero = zero/n;
		
		System.out.println(String.format("%.6f\n%.6f\n%.6f", pos,neg,zero));
	}
}
