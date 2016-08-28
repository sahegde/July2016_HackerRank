package sampleProj;

import java.util.Scanner;

public class InsertionSort2 {
	static Scanner sc = new Scanner(System.in);
	
	static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		String str[] = sc.nextLine().split(" ");
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		for (int i = 0; i < arr.length -1; i++) {
			int val = arr[i+1];
			int j = i;
			while((j >= 0) && (val < arr[j])){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val;
			printArray(arr);
		}
	}
}
