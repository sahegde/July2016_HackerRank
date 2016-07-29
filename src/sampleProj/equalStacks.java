package sampleProj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class equalStacks {
	static Scanner sc = new Scanner(System.in);
	
	public static int findMax(int a,int b,int c) {
		if(a >= b && a >= c) {
			return 0;
		}else if(b >=a && b >= c ){
			return 1;
		}else if(c >= a && c >= b) {
			return 2;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int a1 = Integer.parseInt(str[0]);
		int a2 = Integer.parseInt(str[1]);
		int a3 = Integer.parseInt(str[2]);
		
		int weights[] = new int[3];
		
		List<Stack<Integer>> ls = new ArrayList<Stack<Integer>>();
		for (int i = 0; i < 3; i++) {
			ls.add(new Stack<Integer>());
		}
		
		str = sc.nextLine().split(" ");
		
		Stack<Integer> temp = ls.get(0);
		for (int i = (a1-1); i >= 0; i--) {
			int val = Integer.parseInt(str[i]);
			weights[0] = weights[0] + val;
			temp.push(val);
		}
		ls.set(0,temp);
	
		str = sc.nextLine().split(" ");
		
		temp = ls.get(1);
		for (int i = (a2-1); i >= 0; i--) {
			int val = Integer.parseInt(str[i]);
			weights[1] = weights[1] + val;
			temp.push(val);
			
		}
		ls.set(1,temp);
		
		str = sc.nextLine().split(" ");
		
		temp = ls.get(2);
		for (int i = (a3-1); i >= 0; i--) {
			int val = Integer.parseInt(str[i]);
			weights[2] = weights[2] + val;
			temp.push(val);
		}
		ls.set(2,temp);
		
		
		int max = findMax(weights[0],weights[1],weights[2]);
		while(weights[0] >= 0 && weights[1] >= 0 && weights[2] >= 0) {
			if(weights[0] == weights[1] && weights[0] == weights[2]) {
				System.out.println(weights[0]);
				break;
			}else {
				temp = ls.get(max);
				weights[max] = weights[max] - temp.pop();
				ls.set(max, temp);
				max = findMax(weights[0],weights[1],weights[2]);
			}
		}
		
	}
}
