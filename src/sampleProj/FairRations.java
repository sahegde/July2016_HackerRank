package sampleProj;

import java.util.Scanner;

public class FairRations {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		
		String arr[] = sc.nextLine().split(" ");
		int a[] = new int[n];
		
		int countOddNumbers = 0;
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(arr[i]);
			if(a[i] % 2 == 1) {
				countOddNumbers++;
			}
		}
		
		if(countOddNumbers % 2 == 1) {
			System.out.println("NO");
			return;
		}else {
			int firstOdd = -1;
			int secondOdd = -1;
			for (int i = 0; i < a.length; i++) {
				if(a[i] % 2 == 1 && firstOdd == -1) {
					firstOdd = i;
				}else if(a[i] % 2 == 1 && secondOdd == -1) {
					secondOdd = i;
					sum = sum + (2 * (secondOdd - firstOdd));
					firstOdd = -1;
					secondOdd = -1;
				}
			}
		}
		
		System.out.println(sum);
	}
}
