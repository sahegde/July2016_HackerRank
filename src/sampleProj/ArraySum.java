package sampleProj;

import java.util.Scanner;

public class ArraySum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		String str[] = sc.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(str[i]);
		}
		
		System.out.println(sum);
	}
}
