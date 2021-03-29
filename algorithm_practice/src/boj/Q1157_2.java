package boj;

import java.util.Scanner;

public class Q1157_2 {
	
	private static char findMaxChar(String str) {
		char result = '?';
		String s = str.toUpperCase();
		char[] ch = new char[26];
		for(int i=0; i<s.length(); i++) {
			ch[s.charAt(i)-'A']++;
		}
		
		int max=0;
		for(int i=0; i<ch.length; i++) {
			if(max<ch[i]) {
				max = ch[i];
				result = (char)(i+'A');
			}
			else if(max == ch[i]) {
				result = '?';
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(findMaxChar(s));
	}

}
