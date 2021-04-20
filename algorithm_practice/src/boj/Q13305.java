package boj;

import java.util.Scanner;

public class Q13305 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input
		int n = scanner.nextInt();
		long[] roads = new long[n - 1];
		long[] oils = new long[n];
		
		for(int i = 0; i < roads.length; i++) {
			roads[i] = scanner.nextLong();
		}
		for(int i = 0; i < oils.length; i++) {
			oils[i] = scanner.nextLong();
		}
		
		//Values
		long[] dp = new long[n];
		long min = oils[0];
		
		//Initial condition
		dp[0] = 0;
		dp[1] = min * roads[0];
		
		//Recurrence relation
		for(int i = 2; i < n; i++) {
			if(oils[i - 1] < min) {
				min = oils[i - 1];
			}
			dp[i] = dp[i - 1] + min * roads[i - 1];
		}
		
		//Output
		System.out.println(dp[n - 1]);
		
		scanner.close();
	}

}
