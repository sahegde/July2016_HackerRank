package sampleProj;

import java.math.BigInteger;
import java.util.Scanner;

public class StrangeCounter {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger b = new BigInteger(sc.nextLine());
		BigInteger two = new BigInteger("2");
		BigInteger n = new BigInteger("3");
		
		while(b.compareTo(n) > 0) {
			b = b.subtract(n);
			n = n.multiply(two);
		}
		
		BigInteger num = (n.subtract(b)).add(BigInteger.ONE);
		System.out.println(num.toString());
	}
}
