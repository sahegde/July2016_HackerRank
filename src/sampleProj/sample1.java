package sampleProj;

import java.io.FileInputStream;
import java.io.InputStream;

public class sample1 {
	
	private static String getPid() throws Exception{
	    byte[] bo = new byte[256];
	    InputStream is = new FileInputStream("/proc/self/stat");
	    is.read(bo);
	    for (int i = 0; i < bo.length; i++) {
	        if ((bo[i] < '0') || (bo[i] > '9')) {
	            return new String(bo, 0, i);
	        }
	    }
	    return "-1";
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(sample1.getPid());
	}
}
