package sampleProj;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class icpc {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int maxPeople = 0;
		int maxTopicsTillNow = 0;
		
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			l.add(sc.nextLine());
		}
		
		
		for (int i = 0; i < n-1; i++) {		
			for (int j = i+1; j < n; j++) {
				
				String s1 = l.get(i);
				String s2 = l.get(j);
				
				int setBits = 0;
				
				for (int k = 0; k < m; k++) {
					if(s1.charAt(k) == '1' || s2.charAt(k) == '1') {
						setBits++;
					}
				}

			    if(setBits > maxTopicsTillNow) {
			    	maxTopicsTillNow = setBits;
			    	maxPeople = 1;
			    }else if(setBits == maxTopicsTillNow) {
			    	maxTopicsTillNow = setBits;
			    	maxPeople++;
			    }
			}
		}
		
		System.out.println(maxTopicsTillNow);
		System.out.println(maxPeople);
	}
}
