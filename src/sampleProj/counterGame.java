package sampleProj;

import java.math.BigInteger;
import java.util.Scanner;

public class counterGame {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		int res[] = new int[t];
		for (int i = 0; i < t; i++) {
			BigInteger n = new BigInteger(sc.nextLine());
			int countWinner = 0;
			while(n.compareTo(BigInteger.ONE) == 1) {
				int counter = -1;
				BigInteger temp = n;
				while(temp.compareTo(BigInteger.ZERO) == 1) {
					temp = temp.divide(new BigInteger("2"));
					System.out.println(temp);
					counter++;
				}
				BigInteger nearestPowerOf2 = new BigInteger((int)Math.pow(2, counter)+"");
				BigInteger big = n.xor(nearestPowerOf2);
				if(big.compareTo(BigInteger.ZERO) == 0) {
					n = n.divide(new BigInteger("2"));
				}else {
					n = n.subtract(nearestPowerOf2);
				}
				countWinner++;
			}
			
			if(countWinner % 2 == 1) {
				res[i] = 1;
			}else {
				res[i] = 0;
			}
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println((res[i] == 1) ? "Louise" : "Richard");
		}
	}
}
