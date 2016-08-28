package sampleProj;

import java.util.Scanner;

public class MarsExploration {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.nextLine();
		int count = 0;
		int start = 0;
		while(start < str.length()) {
			String temp = str.substring(start, start+3);
			if(temp.charAt(0) != 'S') {
				count++;
			}
			if(temp.charAt(1) != 'O') {
				count++;
			}
			if(temp.charAt(2) != 'S') {
				count++;
			}
			start = start + 3;
		}
		System.out.println(count);
	}
}
