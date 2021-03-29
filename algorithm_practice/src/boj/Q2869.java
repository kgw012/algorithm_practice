package boj;

import java.util.Scanner;

public class Q2869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down = sc.nextInt();
		int v = sc.nextInt();
		int n = (v-up)/(up-down)+1;
		
		if((v-up) % (up-down) != 0) {
			n++;
		}
		
		System.out.println(n);
		
	}

}