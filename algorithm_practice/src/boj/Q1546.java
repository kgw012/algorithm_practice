package boj;

import java.util.Scanner;

public class Q1546 {
	
	private static int findMax(int[] a) {
		int max = a[0];
		for(int i : a) {
			if(max<i) max=i;
		}
		return max;
	}
	
	private static double solution(int[] a) {
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		double mean = (double)sum/(double)a.length;
		
		double[] b = new double[a.length];
		for(int i=0; i<b.length; i++) {
			b[i] = (double)a[i]/(double)findMax(a)*100;
		}
		
		double bsum = 0;
		for(int i=0; i<b.length; i++) {
			bsum+=b[i];
		}
		double modifiedMean = bsum/b.length;
		
		return modifiedMean;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(solution(a));
	}

}
