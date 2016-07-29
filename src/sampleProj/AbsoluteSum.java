package sampleProj;

import java.util.Scanner;

public class AbsoluteSum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		
		int a[][] = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String str[] = sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				a[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int d1 = 0,d2 = 0;
		for (int i = 0; i < n; i++) {
			d1 += a[i][i];
		}
		
		int index1 = n-1, index2 = 0;
		for (int i = 0; i < n; i++) {
			d2 += a[index1--][index2++];
		}
		
		System.out.println(Math.abs(d1 - d2));
	}
}
