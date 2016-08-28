package sampleProj;

import java.util.Scanner;

public class jumpingOnClouds2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		str = sc.nextLine().split(" ");
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int counter = k % n;
		int energy = 100;
		while(counter != 0) {
			if(arr[counter] == 1) {
				energy = energy - 3;
			}else {
				energy = energy - 1;
			}
			counter = (counter + k) % n;
		}
		
		if(arr[counter] == 1) {
			energy = energy - 3;
		}else {
			energy = energy - 1;
		}
		
		System.out.println(energy);
	}
}
