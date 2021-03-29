package boj;

import java.util.Scanner;

public class Q2577 {

	private static int numCount(int iNum, int findNum) {
		String sNum = String.valueOf(iNum);
		int count = 0;
		for(int i=0; i<sNum.length(); i++) {
			if((sNum.charAt(i) - '0') == findNum)
				count++;
		}
		return count;
	}
	
	private static void solution(int a, int b, int c) {
		int abc = a*b*c;
		for(int i=0; i<=9; i++) {
			int count = numCount(abc, i);
			System.out.println(count);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		solution(a,b,c);
	}

}
