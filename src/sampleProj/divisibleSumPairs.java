package sampleProj;

import java.util.Scanner;

public class divisibleSumPairs {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		str = sc.nextLine().split(" ");
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n; j++) {
				if((arr[i] + arr[j]) % k == 0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
