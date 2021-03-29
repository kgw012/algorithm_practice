package boj;

import java.util.Scanner;

public class Q5622 {

	private static int time(String s) {
		char[] ch = s.toCharArray();
		
		int[] chI = new int[8];
		
		for(int i=0; i<ch.length; i++) {
			int index;
			int n = ch[i]-'A';
			if(n>=22) {
				index = 7;
			}
			else if(n>=19) {
				index = 6;
			}
			else if(n>=15) {
				index = 5;
			}
			else {
				index = (ch[i]-'A')/3;
			}
			chI[index]++;
		}
		
		int sec=0;
		for(int i=0; i<chI.length; i++){
			sec += chI[i] * (i+3);
		}
		
		return sec;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		System.out.println(time(s));
	}

}