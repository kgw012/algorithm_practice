package boj;

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		for(int i=0; i<k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
		}
		
	}

}
