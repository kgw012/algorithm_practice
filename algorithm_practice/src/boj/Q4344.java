package boj;

import java.util.Scanner;

public class Q4344 {
	
	
	private static double solution(int[] a) {
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		double mean = (double)sum/(double)a.length;
		
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>mean) count++;
		}
		
		double ratio = (double)count / (double)a.length * 100;
		
		return ratio;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		double[] ans = new double[c];
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();
			int[] test = new int[n];
			
			for(int j=0; j<test.length; j++) {
				test[j] = sc.nextInt();
			}
			
			ans[i] = solution(test);
		}
		
		for(double i : ans) {
			System.out.printf("%.3f%%\n", i);
		}
		
	}

}
