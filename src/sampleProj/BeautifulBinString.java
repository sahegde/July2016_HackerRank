package sampleProj;

import java.util.Scanner;

public class BeautifulBinString {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		
		int endIndex = -1, startIndex = 0,nextIndex = 0,count = 0;
		
		while(endIndex < str.length()) {
			startIndex = str.indexOf("010", nextIndex);
			if(startIndex == -1) {
				break;
			}
			if(startIndex == endIndex) {
				nextIndex = startIndex + 1;
				continue;
			}
			endIndex = startIndex + 2;
			count++;
			nextIndex = startIndex + 1;
		}
		
		System.out.println(count);
	}
}
