package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ar1 = new ArrayList<>();
		
		//1 2 4 7 11 16 22 -----
		//arNum이 홀수일때 : 분모가 1부터 시작(1/1, 3/1, ---)
		//arNum이 짝수일때 : 분자가 1부터 시작(1/2, 1/4, ---)
		
		int x = sc.nextInt();
		
		int addNum = 1;
		int i = 0;
		
		while(true) {
			i = (i + addNum);
			if(x<=i) break;
			addNum++;
		}
		
		int ans;
		int ans1 = x-(i-addNum);
		int ans2 = (addNum + 1) - ans1;
		if(addNum%2 == 0) {
			System.out.println(ans1 + "/" + ans2);
		}
		else {
			System.out.println(ans2 + "/" + ans1);
		}
	}
}
