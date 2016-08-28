package sampleProj;

import java.util.Scanner;

public class lonelyInteger {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		
		String str[] = sc.nextLine().split(" ");
		int totalXor = 0;
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(str[i]);		
			totalXor = totalXor ^ temp;
		}
		
		System.out.println(totalXor);
	}
}
