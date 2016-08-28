package sampleProj;

import java.util.BitSet;
import java.util.Scanner;

public class BeautifulTriplets {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int d = Integer.parseInt(str[1]);
		
		str = sc.nextLine().split(" ");
		BitSet b = new BitSet(10000);
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			int val = Integer.parseInt(str[i]);
			b.set(val);
			a[i] = val;
		}
		
		int tripletsCounter = 0;
		
		for (int i = 0; i < n-2; i++) {
			if(b.get(a[i] + d) && b.get(a[i] + 2*d)) {
				tripletsCounter++;
			}
		}
		
		System.out.println(tripletsCounter);
	}
}
