package sampleProj;

import java.util.HashMap;

public class sampleRank {
	public static void main(String []args){
		HashMap<String, String> m = new HashMap<String , String>();
		m.put("jan", "01");
		m.put("feb", "02");
		m.put("mar", "03");
		m.put("apr", "04");
		m.put("may", "05");
		m.put("jun", "06");
		m.put("jul", "07");
		m.put("aug", "08");
		m.put("sep", "09");
		m.put("oct", "10");
		m.put("nov", "11");
		m.put("dec", "12");
		
		String sample = "1th jun 1983";
		String [] s = sample.split(" ");
		String year = s[2];
		String month = m.get(s[1].toLowerCase());
		String printableDate;
		String []date = s[0].split("th");
		if(date[0].length() == 1){
			printableDate = "0"+date[0];
		}else{
			printableDate = date[0];
		}
		System.out.println(year+"-"+month+"-"+printableDate);
	}
}
