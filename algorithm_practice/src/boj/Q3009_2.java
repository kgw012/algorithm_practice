package boj;

import java.util.Scanner;

public class Q3009_2 {
	
	private static int ans(int a, int b, int c) {
		if(a == b) return c;
		else if(a == c) return b;
		else return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] ar = new int[3][2];
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		int x = ans(ar[0][0], ar[1][0], ar[2][0]);
		int y = ans(ar[0][1], ar[1][1], ar[2][1]);
		
		System.out.println(x + " " + y);
	}

}
