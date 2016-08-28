package sampleProj;

import java.util.Scanner;

public class insertionSort {
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
		
		int val = arr[n-1];
		boolean isSet = false;
		for (int i = n-2; i >= 0; i--) {
			int curVal = arr[i];
			if(val <=  curVal) {
				arr[i+1] = arr[i];
			}else if(val > curVal) {
				arr[i+1] = val;
				printArray(arr);
				isSet = true;
				break;
			}
			printArray(arr);
		}
		
		if(!isSet) {
			arr[0] = val;
			printArray(arr);
		}
	}
}
