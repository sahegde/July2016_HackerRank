package sampleProj;

import java.util.Arrays;
import java.util.Scanner;

public class FlatLandSpaceStations {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int spaceStations[] = new int[m];
		str = sc.nextLine().split(" ");
		
		for (int i = 0; i < m; i++) {
			spaceStations[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(spaceStations);
		
		int stations[] = new int[n];
		Arrays.fill(stations, 0);
		
		int spaceCounter = 0;
		
		for (int i = 0; i < n; i++) {
			
			if(i < spaceStations[spaceCounter]) {
				stations[i] = spaceStations[spaceCounter] - i;
			}
			
			if(i > spaceStations[spaceCounter] && (spaceCounter == (spaceStations.length - 1))) {
				stations[i] = i - spaceStations[spaceCounter];
			}
			
			if(i > spaceStations[spaceCounter] && (spaceCounter < (spaceStations.length - 1)) && i < spaceStations[spaceCounter+1]) {
				int a = i - spaceStations[spaceCounter];
				int b = spaceStations[spaceCounter+1] - i;
				stations[i] = Math.min(a, b);
			}
			

			
			if((spaceCounter < (spaceStations.length - 1)) && i == spaceStations[spaceCounter+1]) {
				spaceCounter++;
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < stations.length; i++) {
			if(stations[i] > max) {
				max = stations[i];
			}
		}
		
		System.out.println(max);
	}
}
