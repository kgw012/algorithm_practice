package boj;

import java.util.Scanner;

public class Q10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b) {
			if(b>=c) {
				System.out.println(b);
			}
			else if(a>=c) {
				System.out.println(c);
			}
			else {
				System.out.println(a);
			}
		}
		else if(a<b) {
			if(a>=c) {
				System.out.println(a);
			}
			else if(b>=c) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}
		sc.close();
	}
}