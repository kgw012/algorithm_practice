package boj;

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] tArr = new int[t];
		
		for(int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int count=0;
			
			int[][] arr = new int[h][w];
			
			int j=0;
			int k=0;
			loop:
			for(k=0; k<w; k++) {
				for(j=0; j<h; j++) {
					count++;
					arr[j][k] = 1;
					if(count == n) break loop;
				}
			}
			
			int ans = (j+1)*100 + (k+1);
			tArr[i] = ans;
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(tArr[i]);
		}
	}

}
