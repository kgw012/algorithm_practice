package boj;

import java.util.Scanner;

public class Q1712 {
	
	private static int breakEvenPoint(long a, long b, long c) {
		int i;
		for(i=1; (a + b * i) >= (c * i); i++) {
			if((c-b)<=0) {
				i=-1;
				break;
			}
		}
		return i;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		System.out.println(breakEvenPoint(a, b, c));
	}

}
