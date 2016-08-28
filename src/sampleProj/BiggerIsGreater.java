package sampleProj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BiggerIsGreater {
	static Scanner sc = new Scanner(System.in);
	
	private static String sort(String str) {
		// put the characters into an array
		Character[] chars = new Character[str.length()];
		for (int i = 0; i < chars.length; i++)
		    chars[i] = str.charAt(i);

		// sort the array
		Arrays.sort(chars, new Comparator<Character>() {
		    public int compare(Character c1, Character c2) {
		        int cmp = Character.compare(
		            Character.toLowerCase(c1.charValue()),
		            Character.toLowerCase(c2.charValue())
		        );
		        if (cmp != 0) return cmp;
		        return Character.compare(c1.charValue(), c2.charValue());
		    }
		});

		// rebuild the string
		StringBuilder sb = new StringBuilder(chars.length);
		for (char c : chars) sb.append(c);
		str = sb.toString();
		
		return str;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		String res[] = new String[n];
		
		for (int i = 0; i < n; i++) {
			boolean isSet = false;
			StringBuilder str = new StringBuilder(sc.nextLine());
			int len = str.length();
			outer : for (int j = len-1; j > 0 ; j--) {
				for (int k = j-1; k >= 0; k--) {
					if(str.charAt(j) > str.charAt(k)) {
						char temp = str.charAt(j);
						str.setCharAt(j, str.charAt(k));
						str.setCharAt(k, temp);
						String ss = BiggerIsGreater.sort(str.substring(k+1));
						String ss1 = str.substring(0,k+1) + ss;
						isSet = true;
						res[i] = ss1;
						break outer;
					}
				}
			}
			if(!isSet) {
				res[i] = "no answer";
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
