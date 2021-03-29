package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ansArr = new ArrayList<>();
		
		int n; int i;
		for(n=2; n<=500; n++) {
			for(i=2; i<=n; i++) {
				if(n%i==0) break;
			}
			if(n==i) ansArr.add(i);
		}
		
		
		int t = sc.nextInt();
		int[] inArr = new int[t];
		for(int j=0; j<t; j++) {
			inArr[j] = sc.nextInt();
		}
		
		int count=0;
		for(int j=0; j<t; j++) {
			for(int k=0; k<ansArr.size(); k++) {
				if(inArr[j] == ansArr.get(k)) count++;
			}
		}
		System.out.println(count);
	}

}
