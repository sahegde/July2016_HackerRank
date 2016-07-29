package sampleProj;

import java.util.Scanner;

public class jumpingOnClouds {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		
		String str[] = new String[n];
		str = sc.nextLine().split(" ");
		
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int count = 0;
		int curPlace = 0;
		while(curPlace <= (n-1)) {
			if(curPlace == (n-1)) {
				break;
			}
			if((curPlace + 2) <=(n-1)  && arr[curPlace+2] == 0) {
				count++;
				curPlace = curPlace + 2;
			}else if((curPlace +1) <= (n-1) && arr[curPlace+1] == 0) {
				count++;
				curPlace = curPlace + 1;
			}
		}
		
		System.out.println(count);
	}
}
