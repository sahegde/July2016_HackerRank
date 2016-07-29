package sampleProj;

import java.util.Scanner;

public class circularArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		k = k % n;
		int q = Integer.parseInt(str[2]);
		
		str = sc.nextLine().split(" ");
		int arr[] = new int[n];
		int arr1[] = new int[n];
		int j = 0;
		
		int res[] = new int[q];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		for (int i = n-k; i < arr.length; i++,j++) {
			arr1[j] = arr[i];
		}
		
		for (int i = 0; i < n-k; i++,j++) {
			arr1[j] = arr[i];
		}
		
		for (int i = 0; i < q; i++) {
			int query = Integer.parseInt(sc.nextLine());
			res[i] = arr1[query];
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
