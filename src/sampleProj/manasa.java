package sampleProj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manasa {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		List<String> res = new ArrayList<String>();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			int a = Integer.parseInt(sc.nextLine());
			int b = Integer.parseInt(sc.nextLine());
			
			if(a > b) {
				int temp = a;
				a = b;
				b = temp;
			}else if(a == b) {
				int sum = a * (n-1);
				res.add(sum+"");
				continue;
			}
			
			int sum = a * (n-1);
			String ans = sum+"";
			for (int j = 0; j < n-1; j++) {
				sum = sum + (b-a);
				ans = ans +" "+sum;
			}
			res.add(ans);
		}
		
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
}
