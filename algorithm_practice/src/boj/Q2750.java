package boj;

import java.util.Scanner;

public class Q2750 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i < n; i++) {
			int tmp = arr[i];
			int ptr = i;
			
			while(true) {
				if(ptr == 0) {
					arr[ptr] = tmp;
					break;
				}
				
				if(arr[ptr - 1] > tmp) {
					arr[ptr] = arr[ptr - 1];
					ptr--;
				}else {
					arr[ptr] = tmp;
					break;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
