package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1181 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) return 1;
				if(s1.length() < s2.length()) return -1;
				
				if(s1.compareTo(s2) > 0) return 1;
				
				return -1;
			}
			
		});
		
		String tmp = "";
		for(int i = 0; i < n; i++) {
			String s = arr[i];
			if(tmp.equals(s)) continue;
			System.out.println(s);
			tmp = s;
		}
		
	}

}
