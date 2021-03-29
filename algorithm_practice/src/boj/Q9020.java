package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[][] ans = new int[t][2];
		
		for(int z=0; z<t; z++) {

			ArrayList<Integer> ar = new ArrayList<>();
			
			int n = sc.nextInt();
			
			ar.add(2);
			
			for(int i=3; i<=n; i++) {
				int j=0;
				for(j=0; j<ar.size(); j++) {
					if(i%ar.get(j) == 0) break;
					if(ar.get(j) > Math.sqrt(i)) break;
				}
				if(ar.get(j) > Math.sqrt(i)) {
					ar.add(i);
				}
			}
			
			int[][] ansArr = new int[ar.size()][2];
			int count = 0;
			for(int i=0; i<ar.size(); i++) {
				for(int j=i; j<ar.size(); j++) {
					if(ar.get(i) + ar.get(j) == n) {
						ansArr[count][0] = ar.get(i);
						ansArr[count][1] = ar.get(j);
						count++;
					}
				}
			}
			
			int[] min = {0, n};
			for(int i=0; i<ansArr.length && ansArr[i][0] != 0; i++) {
				
				if( (min[1] - min[0]) > (ansArr[i][1] - ansArr[i][0]) ) {
					min[0] = ansArr[i][0];
					min[1] = ansArr[i][1];
				}
			}
			ans[z][0] = min[0];
			ans[z][1] = min[1];
		}
		
		for(int z=0; z<t; z++) {
			System.out.printf("%d %d\n", ans[z][0], ans[z][1]);
		}

	}
}