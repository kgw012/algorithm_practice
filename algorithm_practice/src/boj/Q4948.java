package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n=sc.nextInt();
			if(n==0) break;
			int[] ar = new int[n*2];
			
			ar[0] = 2;
			int count=0;
			
			for(int i=3; i<=n*2; i++) {
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
			
			int count2 = 0;
			for(int i=0; ar[i]<=n*2 && ar[i]!=0; i++) {
				if(ar[i]>n) {
					count2++;
				}
			}
			System.out.println(count2);
		}
		
		
		
	}
}