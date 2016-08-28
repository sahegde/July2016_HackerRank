package sampleProj;

import java.util.Scanner;

public class SherlockAndArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		boolean res[] = new boolean[t];
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			int arr[] = new int[n];
			String str[] = sc.nextLine().split(" ");
			int sum = 0;
			for (int j = 0; j < str.length; j++) {
				arr[j] = Integer.parseInt(str[j]);
				sum += arr[j];
			}
			
			boolean yes = false;
			int leftSum = 0;
			int rightSum = sum;
			for (int j = 0; j < n; j++) {
				int cur = arr[j];
				rightSum = rightSum - cur;
				
				if(leftSum == rightSum) {
					yes = true;
					break;
				}
				leftSum = leftSum + cur;
			}
				
			res[i] = yes;
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println(res[i] ? "YES":"NO");
		}
		
	}
}
