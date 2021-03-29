package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ansArr = new ArrayList<>();
		
		int n; int i;
		for(n=2; n<=10000; n++) {
			for(i=2; i<=n; i++) {
				if(n%i==0) break;
			}
			if(n==i) ansArr.add(i);
		}
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int sum=0;
		int min=n2;
		for(int j=n1; j<=n2; j++) {
			for(int k=0; k<ansArr.size(); k++) {
				if(j == ansArr.get(k)) {
					sum += j;
					if(min>j) min=j;
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

}
