package boj;

import java.util.Scanner;

public class Q11729 {
	private static int count = 0;
	private static StringBuilder sb = new StringBuilder();
	
	private static void hanoi(int n, int x, int y) {
		
		int z = 6-x-y;

		if(n>=2) {
			hanoi(n-1, x, z);
		}
		
		sb.append(x + " " + y + "\n");
		count++;
		
		if(n>=2) {
			hanoi(n-1, z, y);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		hanoi(n, 1, 3);
		
		System.out.println(count);
		System.out.print(sb);
	}

}
