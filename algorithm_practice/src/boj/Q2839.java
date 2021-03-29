package boj;

import java.util.Scanner;

public class Q2839 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] n3 = new int[5000/3+1];
		for(int i=0; i<n3.length; i++) {
			n3[i] = 3*i;
		}
		
		int[] n5 = new int[5000/5+1];
		for(int i=0; i<n5.length; i++) {
			n5[i] = 5*i;
		}
		
		int ans = -1;
		
		loop:
		for(int i=0; i<n3.length; i++) {
			for(int j=0; j<n5.length; j++) {
				if( (j*5 + i*3) == n ) {
					ans = j+i;
					break loop;
				}
			}
		}
		
		System.out.println(ans);
		
	}

}
