package sampleProj;

import java.util.Scanner;

public class LisaWorkbook {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);	
		
		str = sc.nextLine().split(" ");
		int pageNum = 1;
		int count  = 0;
		int counter = 0;
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(str[i]);
			for (int j = 1; j <= temp; j++) {
				if(pageNum == j) {
					count++;
				}
				counter++;
				if(counter == k) {
					counter = 0;
					pageNum++;
				}
			}
			if(counter != 0) {
				pageNum++;
				counter = 0;
			}
		}
		System.out.println(count);
	}
}
