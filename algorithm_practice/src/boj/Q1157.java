package boj;

import java.util.Scanner;

public class Q1157 {
	
	private static char findMaxChar(String s) {
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] -= ('a'-'A');
			}
		}
		
		char[] alp = new char[26];
		
		for(int i=0; i<ch.length; i++) {
			alp[(int)ch[i]-'A']++;
		}
		
		int max=alp[0];
		for(int i=0; i<alp.length; i++) {
			if(alp[i]>max) max=alp[i];
		}
		
		int count=0;
		for(int i=0; i<alp.length; i++) {
			if(alp[i]==max) count++;
		}
		if(count>1) return '?';
		else {
			for(int i=0; i<alp.length; i++) {
				if(alp[i]==max) return (char)(i+'A');
			}
		}
		return '?';
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(findMaxChar(str));
	}

}
