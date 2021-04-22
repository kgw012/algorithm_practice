package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Q18870 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int[] tmp_arr = arr.clone();
		
		Arrays.sort(arr);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], idx++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(map.get(tmp_arr[i])).append(' ');
		}
		System.out.println(sb.toString());
	}
}
