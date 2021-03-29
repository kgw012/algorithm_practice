package boj;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = n;
		int count = 0;
		int a;
		do {
			a = n%10 + n/10;
			n = a%10 + (n%10)*10;
			count++;
		}
		while(!(k==n));
		
		System.out.println(count);
	}

}
