package sampleProj;

import java.util.Scanner;

public class maxSubArraySum {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		int res[] = new int[t];
		for (int i = 0; i < t; i++) {
			String str[] = sc.nextLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			
			str = sc.nextLine().split(" ");
			int arr[] = new int[n];
			
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(str[j]);
			}
			int maxMod = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n-j; k++) {
					int sum = 0;
					for (int q = k; q < k+j+1; q++) {
						sum += arr[q];
					}
					int temp = (sum % m);
					if(temp  > maxMod) {
						maxMod = temp;
					}
				}		
			}
			res[i] = maxMod;
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println(res[i]);
		}
	}
}
