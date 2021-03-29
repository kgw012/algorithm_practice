package boj;

import java.util.Scanner;

public class Q2292_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//1 7 19 37
		//1 1+6 7+6+6 19+6+6+6
		
		int roomNum=1;
		int addNum=6;
		int ans=1;
		
		while(true) {
			if(n<=roomNum) break;
			
			roomNum+=addNum;
			addNum+=6;
			ans++;
		}
		
		System.out.println(ans);
	}

}
