package boj;

import java.util.Scanner;

public class Q1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] ansArr = new int[t];
		
		for(int i=0; i<t; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int l = y-x;
			int n=1;
			
			while(n<Math.sqrt(l)) {
				n++;
			}
			
			int ans = 0;
			if( l <= (n*n - n) ) {
				ans = 2*n - 2;
			}
			else {
				ans = 2*n - 1;
			}
			
			ansArr[i] = ans;
		}
		
		for(int i : ansArr) {
			System.out.println(i);
		}
	}
	
}