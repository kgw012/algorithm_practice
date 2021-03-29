package boj;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i : ar) {
			if(i<x) {
				System.out.print(i + " ");
			}
		}
	}

}
