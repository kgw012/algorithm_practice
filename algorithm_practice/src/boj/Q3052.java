package boj;

import java.util.Scanner;

public class Q3052 {
	
	private static boolean findSameIndex(int[] a, int n) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == n) {
				return true;
			}
		}
		return false;
		
	}
	
	private static int solution(int[] a, int num) {
		
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i] = a[i]%num;
		}
		
		int[] rem = new int[b.length];
		int count=0;
		for(int i=0; i<rem.length; i++) {
			rem[i] = -1;
		}
		
		for(int i=0; i<b.length; i++) {
			if(!findSameIndex(rem, b[i])) {
				rem[count] = b[i];
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(solution(a, 42));
		
	}

}
