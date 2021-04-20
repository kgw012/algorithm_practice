package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2108 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] tmp_arr = new int[8001];
		int[] ans_arr = new int[4];
		
		int sum = 0;
		
		int max_num = 0;
		int max = -4001;
		int min = 4001;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			tmp_arr[k + 4000]++;
			sum += k;
			
			if(max_num < tmp_arr[k + 4000]) {
				max_num = tmp_arr[k + 4000];
				list.clear();
				list.add(k);
			}else if(max_num == tmp_arr[k + 4000]) {
				list.add(k);
			}
			
			if(max < k) {
				max = k;
			}
			if(min > k) {
				min = k;
			}
		}
		
		if(list.size() == 1) {
			ans_arr[2] = list.get(0);
		}else {
			Collections.sort(list);
			ans_arr[2] = list.get(1);
		}
		
		int idx = 0;
		int[] arr = new int[n];
		for(int i = 0; i <= 8000; i++) {
			int tmp = tmp_arr[i];
			while(tmp > 0) {
				arr[idx++] = i - 4000;
				tmp--;
			}
		}
		
		ans_arr[0] = (int)Math.round(((double)sum / n));
		ans_arr[1] = arr[n / 2];
		ans_arr[3] = max - min;
		
		for(int i = 0; i < 4; i++) {
			System.out.println(ans_arr[i]);
		}
		
		
	}

}
