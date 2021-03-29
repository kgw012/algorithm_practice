package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1065 {
	
	private static ArrayList<Integer> hArr() {

		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=1; i<=99; i++) {
			ar.add(i);
		}
		for(int i=100; i<=999; i++) {
			int a = i/100;
			int b = i/10 - a*10;
			int c = i%10;
			
			if(a-b == b-c) ar.add(i);
		}
		
		return ar;
	}
	
	private static int hNum(int n) {
		
		ArrayList<Integer> ar = hArr();
		int count = 0;
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i) <= n) count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(hNum(n));
	}

}
