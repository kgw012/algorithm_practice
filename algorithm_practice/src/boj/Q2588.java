package boj;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int v3 = a*(b%10);
		int v4 = (a*(b%100)-v3)/10;
		int v5 = (a*b-v3-v4*10)/100;
		int v6 = a*b;
		
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		sc.close();
	}

}
