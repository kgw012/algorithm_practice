package boj;

import java.util.Scanner;

public class Q1316 {
	private static boolean check(String s) {
		
		char[] ch = s.toCharArray();
		String str = "";
		str+=ch[0];
		for(int i=1; i<ch.length; i++) {
			if(ch[i] != ch[i-1]) str+=ch[i];
		}
		
		char[] ch2 = str.toCharArray();
		for(int i=0; i<ch2.length; i++) {
			for(int j=i+1; j<ch2.length; j++) {
				if(ch2[i] == ch2[j]) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			String s = sc.next();
			if(check(s)) count++;
		}
		System.out.println(count);
	}

}