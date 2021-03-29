package boj;

import java.util.Scanner;

public class Q4153 {
	
	private static int max(int a, int b, int c) {
		int max = a;
		if(max<b) max = b;
		if(max<c) max = c;
		return max;
	}
	
	private static int[] notMax(int a, int b, int c) {
		int[] notMax = new int[2];
		
		int max = max(a,b,c);
		if(max == a) {
			notMax[0] = b;
			notMax[1] = c;
		}
		else if(max == b) {
			notMax[0] = a;
			notMax[1] = c;
		}
		else {
			notMax[0] = a;
			notMax[1] = b;
		}
		return notMax;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) break;
			
			int max = max(a,b,c);
			
			int[] notMax = notMax(a,b,c);
			
			int notMax1 = notMax[0];
			int notMax2 = notMax[1];
			
			if(notMax1*notMax1 + notMax2*notMax2 == max*max) {
				System.out.println("right");
			}
			else System.out.println("wrong");
			
		}
	}
}
