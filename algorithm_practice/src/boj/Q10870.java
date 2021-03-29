package boj;

import java.util.Scanner;

public class Q10870 {
	
	private static int fib(int n) {
		if(n>=2) {
			return fib(n-1)+fib(n-2);
		}
		if(n==1) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(fib(n));
	}

}
