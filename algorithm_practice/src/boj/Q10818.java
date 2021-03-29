package boj;

import java.util.Scanner;

public class Q10818 {
	
	private static int findMin(int[] a) {
		int min = a[0];
		for(int i : a) {
			if(min>i) min=i;
		}
		return min;
	}

	private static int findMax(int[] a) {
		int max = a[0];
		for(int i : a) {
			if(max<i) max=i;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i =0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int min = findMin(a);
		int max = findMax(a);
		
		System.out.printf("%d %d", min, max);
	}

}