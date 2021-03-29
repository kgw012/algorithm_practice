package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] ar = new int[n2];
		
		ar[0] = 2;
		int count=0;
		
		for(int i=3; i<=n2; i++) {
			int j=0;
			for(j=0; j<ar.length; j++) {
				if(i%ar[j] == 0) break;
				if(ar[j] > Math.sqrt(i)) break;
			}
			if(ar[j] > Math.sqrt(i)) {
				count++;
				ar[count] = i;
			}
		}
		
		for(int i=0; ar[i]<=n2 && ar[i]!=0; i++) {
			if(ar[i]>=n1) {
				System.out.println(ar[i]);
			}
		}
	}
}