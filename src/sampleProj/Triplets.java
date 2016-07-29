package sampleProj;

import java.util.Scanner;

public class Triplets {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String a[] = sc.nextLine().split(" ");
		String b[] = sc.nextLine().split(" ");
		
		int a0 = Integer.parseInt(a[0]);
		int a1 = Integer.parseInt(a[1]);
		int a2 = Integer.parseInt(a[2]);
		int b0 = Integer.parseInt(b[0]);
		int b1 = Integer.parseInt(b[1]);
		int b2 = Integer.parseInt(b[2]);
		
		int aCount = 0;
		int bCount = 0;
		
		if(a0 > b0) {
			aCount++;
		}else if(b0 > a0) {
			bCount++;
		}
		
		if(a1 > b1) {
			aCount++;
		}else if(b1 > a1) {
			bCount++;
		}
		
		if(a2 > b2) {
			aCount++;
		}else if(b2 > a2) {
			bCount++;
		}
		
		System.out.println(aCount+" "+bCount);
	}
}
