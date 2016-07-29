package sampleProj;

import java.util.HashMap;
import java.util.Scanner;

public class sample {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int happinessCounter = 0;
		
		str = sc.nextLine().split(" ");
		HashMap<Integer,Boolean> arr = new HashMap<Integer,Boolean>();
		
		for (int i = 0; i < n; i++) {
			arr.put(Integer.parseInt(str[i]), true);
		}
		
		str = sc.nextLine().split(" ");
		
		for (int i = 0; i < m; i++) {
			int val = Integer.parseInt(str[i]);
			if(arr.containsKey(val)) {
				happinessCounter++;
			}
		}
		
		str = sc.nextLine().split(" ");
		
		for (int i = 0; i < m; i++) {
			int val = Integer.parseInt(str[i]);
			if(arr.containsKey(val)) {
				happinessCounter--;
			}
		}
		
		System.out.println(happinessCounter);
	}
}
