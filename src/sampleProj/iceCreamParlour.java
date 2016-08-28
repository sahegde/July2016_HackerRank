package sampleProj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class iceCreamParlour {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			int m = Integer.parseInt(sc.nextLine());
			int n = Integer.parseInt(sc.nextLine());
			int arr[] = new int[n];
			String str[] = sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(str[j]);
				map.put(arr[j], j);
			}
			
			int id1 = 0;
			int id2 = 0;
			for (int j = 0; j < n; j++) {
				int temp = m-arr[j];
				if(map.containsKey(temp) && map.get(temp) != j) {
					id1 = j+1;
					id2 = map.get(temp) + 1;
					l.add(id1);
					l.add(id2);
					break;
				}
			}
		}
		
		for (int i = 0; i < t*2; i+=2) {
			System.out.println(l.get(i)+" "+l.get(i+1));
		}
	}
}
