package boj;

import java.util.Scanner;

public class Q2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] tArr = new int[t];
		
		for(int i=0; i<t; i++) {
			int f = sc.nextInt();    //floor
			int r = sc.nextInt();    //roomNum
			
			int[][] arr = new int[f+1][r];
			
			for(int k=0; k<r; k++) {
				arr[0][k] = k+1;
			}
			for(int j=1; j<=f; j++) {
				arr[j][0] = 1;
			}
			
			for(int j=1; j<=f; j++) {
				for(int k=1; k<r; k++){
					int addNum = arr[j-1][k];
					arr[j][k] = arr[j][k-1]+addNum;
				}
			}
			
			int ans = arr[f][r-1];
			tArr[i] = ans;
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(tArr[i]);
		}
		
	}

}
