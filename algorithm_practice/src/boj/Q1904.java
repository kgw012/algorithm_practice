package boj;

import java.util.Scanner;

public class Q1904 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input
		int n = scanner.nextInt();
		
		int[] dp = new int[n + 1];
		
		//Catch array index out of bounds
		if(n == 1) {
			System.out.println(1);
			return;
		}
		if(n == 2) {
			System.out.println(2);
			return;
		}

		//Initial condition
		dp[1] = 1;
		dp[2] = 2;
		
		//Recurrence relation
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
			dp[i] %= 15746;
		}
		
		//Output
		System.out.println(dp[n]);
	}

}
