package boj;

import java.util.Scanner;

public class Q2941 {

	private static int count(String s) {
		int count = 0;
		
		char[] ch = s.toCharArray();
		
		for(int i=2; i<ch.length; i++) {
			if((ch[i] == '=') && (ch[i-1] == 'z') && (ch[i-2] == 'd')) {
				ch[i] = 0;
				ch[i-1] = 0;
			}
		}
		
		for(int i=1; i<ch.length; i++) {
			if((ch[i] == '=') && (ch[i-1] == 'c')) ch[i]=0;
			if((ch[i] == '-') && (ch[i-1] == 'c')) ch[i]=0;
			if((ch[i] == '-') && (ch[i-1] == 'd')) ch[i]=0;
			if((ch[i] == 'j') && (ch[i-1] == 'l')) ch[i]=0;
			if((ch[i] == 'j') && (ch[i-1] == 'n')) ch[i]=0;
			if((ch[i] == '=') && (ch[i-1] == 's')) ch[i]=0;
			if((ch[i] == '=') && (ch[i-1] == 'z')) ch[i]=0;
		}
		for(int i=0; i<ch.length; i++) {
			if(ch[i] != 0) count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(count(str));
	}

}
