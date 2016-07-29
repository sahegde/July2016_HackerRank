package sampleProj;

import java.util.Scanner;

public class Kangaroo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int x1 = Integer.parseInt(str[0]);
		int v1 = Integer.parseInt(str[1]);
		int x2 = Integer.parseInt(str[2]);
		int v2 = Integer.parseInt(str[3]);
		
		if(v1 == v2 && x1 != x2) {
			System.out.println("NO");
		}else if(x1 == x2 && v1 !=v2) {
			System.out.println("NO");
		}else if(x1 < x2 && v1 <= v2) {
			System.out.println("NO");
		}else if(x1 < x2 && v1 > v2) {
			while(x1 < x2) {
				x1 = x1 + v1;
				x2 = x2 + v2;
			}
			if(x1 == x2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else if(x2 < x1 && v2 > v1) {
			while(x2 < x1) {
				x1 = x1 + v1;
				x2 = x2 + v2;
			}
			if(x1 == x2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
