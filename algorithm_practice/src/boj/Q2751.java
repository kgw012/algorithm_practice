package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2751 {
	
	private static int[] arr;
	
	private static void merge_sort(int st, int fn) {
		
		if(fn - st < 2) return;
		
		int mid = (st + fn) / 2;
		int n = fn - st;
		
		merge_sort(st, mid);
		merge_sort(mid, fn);
		
		int ptr1 = st;
		int ptr2 = mid;
		int fn1 = mid;
		int fn2 = fn;
		
		int[] sorted_arr = new int[n];
		int ptr = 0;
		
		while(ptr < n) {
			if(ptr1 >= fn1) {
				while(ptr < n) {
					sorted_arr[ptr++] = arr[ptr2++];
				}
				break;
			}
			if(ptr2 >= fn2) {
				while(ptr < n) {
					sorted_arr[ptr++] = arr[ptr1++];
				}
				break;
			}
			
			if(arr[ptr1] < arr[ptr2]) {
				sorted_arr[ptr++] = arr[ptr1++];
			}else {
				sorted_arr[ptr++] = arr[ptr2++];
			}
		}
		
		ptr = 0;
		
		for(int i = st; i < fn; i++) {
			arr[i] = sorted_arr[ptr++];
		}
		return;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		merge_sort(0, n);
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[i]).append('\n');
		}
		
		System.out.println(sb);
	}

}
