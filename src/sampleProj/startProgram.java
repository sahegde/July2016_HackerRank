package sampleProj;

public class startProgram {
	
	public static void main(String[] args) {
		int n = 10;
		int counter = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n-1 -i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= counter; j++) {
				System.out.print("*");
			}
			counter += 2;
			System.out.println();
		}
	}
}
