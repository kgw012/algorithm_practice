package boj;

import java.util.Scanner;

public class Q2675 {

	private static String solution(int n, String s) {
		
		
		char[] ch = new char[s.length()*n];
		for(int i=0; i<s.length(); i++) {
			for(int j=n*i; j<(n*i + n); j++) {
				ch[j] = s.charAt(i);
			}
		}
		
		return String.valueOf(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[] st = new String[t];
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			
			st[i] = solution(n,s);
		}
		
		for(String i : st) {
			System.out.println(i);
		}
		
		
	}

}
