package boj;

import java.util.Scanner;

public class Q3009 {

	private static int max(int a, int b, int c) {
		int max = a;
		if(max<b) max = b;
		if(max<c) max = c;
		return max;
	}
	
	private static int min(int a, int b, int c) {
		int min = a;
		if(min>b) min = b;
		if(min>c) min = c;
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] ar = new int[3][2];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		int xMax = max(ar[0][0], ar[1][0], ar[2][0]);
		int xMin = min(ar[0][0], ar[1][0], ar[2][0]);
		int yMax = max(ar[0][1], ar[1][1], ar[2][1]);
		int yMin = min(ar[0][1], ar[1][1], ar[2][1]);
		
		int xAns; int yAns;
		
		int xMaxCount = 0;
		for(int i=0; i<3; i++) {
			if(ar[i][0] == xMax) xMaxCount++;
		}
		if(xMaxCount == 2) {
			xAns = xMin;
		}
		else {
			xAns = xMax;
		}
		
		int yMaxCount = 0;
		for(int i=0; i<3; i++) {
			if(ar[i][1] == yMax) yMaxCount++;
		}
		if(yMaxCount == 2) {
			yAns = yMin;
		}
		else {
			yAns = yMax;
		}
		
		System.out.println(xAns + " " + yAns);
	}

}
