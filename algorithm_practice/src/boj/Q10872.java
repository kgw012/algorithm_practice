package boj;

import java.util.Scanner;

public class Q10872 {
	
	private static int Factorial(int n) {
		if(n>=1) {
			return n*Factorial(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(Factorial(n));
	}

}
