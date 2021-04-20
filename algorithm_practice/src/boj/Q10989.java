package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10989 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] count_arr = new int[10001];
		
		while(n > 0) {
			int number = Integer.parseInt(br.readLine());
			count_arr[number]++;
			n--;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 10000; i++) {
			int cnt = count_arr[i];
			while(cnt > 0) {
				sb.append(i).append('\n');
				cnt--;
			}
		}
		
		System.out.println(sb);
	}

}
