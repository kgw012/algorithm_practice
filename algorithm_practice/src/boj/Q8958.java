package boj;

import java.util.Scanner;

public class Q8958 {
	
	private static int solution(String a) {
		
		char[] ch = a.toCharArray();
		int point = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'O') {
				point++;
				int count = 0;
				for(int j=i-1; j>=0; j--) {
					if(ch[j] == 'O') count++;
					else break;
				}
				point+=count;
			}
		}
		
		
		return point;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		String[] a = new String[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.next();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(solution(a[i]));
		}
		
	}

}
