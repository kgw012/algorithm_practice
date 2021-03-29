package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2292 {
	
	private static int numOfPass(int n) {
		ArrayList<Integer> ar = new ArrayList<>();

		ar.add(0, 0);

		int y = 0;
		for(int i=1; ; i++) {
			y = 3*i*(i-1)+1;
			if(y > 1000000000) break;

			ar.add(i, y);
		}
		
		//1 7 19 37 61
		//1 2 3  4  5
		
		
		int i=0;
		for(i=1; i<ar.size(); i++) {
			if(ar.get(i) >= n) break;
		}
		return i;
	}
	

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(numOfPass(n));
	}

}
