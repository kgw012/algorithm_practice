package boj;

import java.util.Scanner;

public class Q2562 {
	
	private static int findMax(int[] a) {
		int max = a[0];
		for(int i : a) {
			if(max<i) max=i;
		}
		return max;
	}
	
	private static int findMaxIndex(int[] a) {
		int max = findMax(a);
		for(int i=0; i<a.length; i++) {
			if(max == a[i])
				return i+1;
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[9];
		
		for(int i=0; i<9; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(findMax(a));
		System.out.println(findMaxIndex(a));
	}

}
