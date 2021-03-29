package boj;

import java.util.Scanner;

public class Q1002 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] ansArr = new int[t];
		
		
		for(int i=0; i<t; i++) {
			int count = -1;
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
			
			if(x1==x2 && y1==y2 && r1==r2)
				count = -1;
			else if(d<Math.abs(r1-r2) || d>(r1+r2))
				count = 0;
			else if(d==Math.abs(r1-r2) || d==(r1+r2))
				count = 1;
			else
				count = 2;
			
			ansArr[i] = count;
		}
		
		for(int i : ansArr) {
			System.out.println(i);
		}
	}

}
