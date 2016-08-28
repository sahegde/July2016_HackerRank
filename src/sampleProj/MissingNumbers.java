package sampleProj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MissingNumbers {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TreeMap<Integer,Integer> t1 = new TreeMap<Integer,Integer>();
		TreeMap<Integer,Integer> t2 = new TreeMap<Integer,Integer>();
		List<Integer> l = new ArrayList<Integer>();
		
		int n = Integer.parseInt(sc.nextLine());
		String str[] = sc.nextLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			int val = Integer.parseInt(str[i]);
			if(t1.containsKey(val)) {
				int count = t1.get(val);
				t1.put(val, count+1);
			}else {
				t1.put(val, 1);
			}
		}
		
		int m = Integer.parseInt(sc.nextLine());
		str = sc.nextLine().split(" ");
		
		for (int i = 0; i < m; i++) {
			int val = Integer.parseInt(str[i]);
			if(t2.containsKey(val)) {
				int count = t2.get(val);
				t2.put(val, count+1);
			}else {
				t2.put(val, 1);
			}
		}
		
		Set<Integer> s2 = t1.keySet();
		Iterator<Integer> i2 = s2.iterator();
		
		while(i2.hasNext()) {
			int key2 = i2.next();
			int val2 = t2.get(key2);
			
			if(t1.containsKey(key2)) {
				int val1 = t1.get(key2);
				if(val1 < val2) {
					l.add(key2);
				}
			}
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
	}
}
