package sampleProj;

import java.util.Scanner;

public class stairCase {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
