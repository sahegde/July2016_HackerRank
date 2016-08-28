package sampleProj;

import java.util.BitSet;
import java.util.Scanner;

public class LarrysArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		Boolean res[] = new Boolean[t];
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			String str[] = sc.nextLine().split(" ");
			int arr[] = new int[n];
			
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(str[j]);			
			}
			
			int inversion = 0;
			BitSet b = new BitSet(n+1);
			
			for (int j = 0; j < n; j++) {
				int count = 0;
				for (int k = 1; k < arr[j] ; k++) {
					if(b.get(k)) {
						count++;
					}
				}
				b.set(arr[j]);
				inversion = inversion + (arr[j] -1 - count);
			}
			
			if(inversion % 2 == 0) {
				res[i] = true;
			}else {
				res[i] = false;
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i] ? "YES" : "NO");
		}
	}
}
