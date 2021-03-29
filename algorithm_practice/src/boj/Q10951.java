package boj;

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=1;
		int b=1;
		
		while(sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}