package sampleProj;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		
		String str[] = sc.nextLine().split(" ");
		
		BigInteger sum = BigInteger.ZERO;
		
		for (int i = 0; i < n; i++) {
			sum = sum.add(new BigInteger(str[i]));
		}
		
		System.out.println(sum.toString());
	}
}
