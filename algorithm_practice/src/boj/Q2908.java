package boj;

import java.util.Scanner;

public class Q2908 {
	
	private static int reverse(int a) {
		int aR = a/100 + a%100/10*10 +a%10*100;
		return aR;
	}
	
	private static int max(int a, int b) {
		
		int max=a;
		if(a<b) max = b;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(max(reverse(a), reverse(b)));
		
	}

}
