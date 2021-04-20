package boj;

import java.util.Scanner;

public class Q1427 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[10];
		
		while(n > 0) {
			int k = n % 10;
			arr[k]++;
			n /= 10;
		}
		
		String s = "";
		for(int i = 9; i >= 0; i--) {
			int k = arr[i];
			while(k > 0) {
				s += Integer.toString(i);
				k--;
			}
		}
		
		System.out.println(s);
	}

}
