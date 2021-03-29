package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {
	
	private static int[] findChar(String s) {
		
		int[] ar = new int[26];
		Arrays.fill(ar, -1);
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ar[ch-'a'] == -1)
			ar[ch-'a'] = i;
		}
		return ar;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] ar = findChar(s);
		
		for(int i=0; i<ar.length; i++) {
			System.out.printf("%d ", ar[i]);
		}
		
	}

}
