package sampleProj;

import java.math.BigInteger;
import java.util.Scanner;

public class together {
	static Scanner sc = new Scanner(System.in);
	
	static BigInteger factorial(BigInteger n) {
		if(n == BigInteger.ZERO || n == BigInteger.ONE) {
			return BigInteger.ONE;
		}
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
	
	public static void main(String[] args) {
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		int uniqueCities = n - c;
		uniqueCities += (m-c);
		uniqueCities += c;
		uniqueCities = uniqueCities - 1;
		
		System.out.println(factorial(new BigInteger(uniqueCities+"")));
	}
}
