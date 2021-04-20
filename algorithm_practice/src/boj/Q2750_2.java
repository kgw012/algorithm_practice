package boj;

import java.util.Scanner;

public class Q2750_2 {
	
	private static void swap(int[] arr, int ptr1, int ptr2) {
		int tmp = arr[ptr1];
		arr[ptr1] = arr[ptr2];
		arr[ptr2] = tmp;
		return;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int last_idx = n - 1; last_idx >= 1; last_idx--) {
			for(int i = 0; i < last_idx; i++) {
				if(arr[i] > arr[i + 1]) {
					swap(arr, i, i+1);
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
