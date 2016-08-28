package sampleProj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class connectedCell {
	static Scanner sc = new Scanner(System.in);
	
	public static void checkAllNeighbours(int arr[][],int i,int j,Queue q) {
		int nIndex[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},
			{1,-1},{1,0},{1,1}};
		
		for (int k = 0; k < nIndex.length; k++) {
				if(arr[i+nIndex[k][0]][j+nIndex[k][1]] == 1) {
					
				}
		}
	}
	
	public static void main(String[] args) {
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		int arr[][] = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			String str[] = sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int maxCountTilNow = 0;
		
		for (int i = 0; i < m; i++) {		
			for (int j = 0; j < n; j++) {
				Queue queue = new LinkedList<>();
				checkAllNeighbours(arr,i,j,queue);
			}
		}
	}
}
