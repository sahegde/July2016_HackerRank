package sampleProj;

import java.util.Scanner;
import java.util.TimeZone;

public class timeConversion {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str[] = sc.nextLine().split(":");
		int hr = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[1]);
		int sec = 0;
		String timeZone = "";
		
		if(str[2].contains("PM")) {
			String temp[] = str[2].split("PM");
			sec = Integer.parseInt(temp[0]);
			timeZone = "PM";
		}else {
			String temp[] = str[2].split("AM");
			sec = Integer.parseInt(temp[0]);
			timeZone = "AM";
		}
		
		if(timeZone.equals("AM")) {
			if(hr == 12) {
				hr = 0;
			}
		}else {
			if(hr != 12) {
				hr = hr + 12;
			}
		}
		
		System.out.println(String.format("%02d:%02d:%02d",hr,min,sec));
	}
}
