package sampleProj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class funnyString {
	static Scanner sc = new Scanner(System.in);
	
	private static String reverseString(String string) {
		StringBuilder str = new StringBuilder(string);
		int startIndex = 0, endIndex = str.length()-1;
		while(startIndex < endIndex) {
			char temp = str.charAt(startIndex);
			str.setCharAt(startIndex, str.charAt(endIndex));
			str.setCharAt(endIndex, temp);
			startIndex++;
			endIndex--;
		}	
		return str.toString();
	}
	
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		List<Boolean> res = new ArrayList<Boolean>();
		
		for (int i = 0; i < t; i++) {
			String str = sc.nextLine();
			String revStr = reverseString(str);
			boolean isFunny = true;
			for (int j = 0; j < str.length()-1; j++) {
				int val1 = (int)Math.abs(str.charAt(j+1) - str.charAt(j));
				int val2 = (int)Math.abs(revStr.charAt(j+1) - revStr.charAt(j));
				if(val1 != val2) {
					isFunny = false;
				}
			}		
			res.add(isFunny);		
		}
		
		for (int i = 0; i < t; i++) {
			if(res.get(i).equals(true)) {
				System.out.println("Funny");
			}else {
				System.out.println("Not Funny");
			}
		}
	}
}
