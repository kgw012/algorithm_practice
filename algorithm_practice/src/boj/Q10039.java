package boj;

import java.util.Scanner;

public class Q10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] point = new int[5];
		for(int i=0; i<5; i++) {
			point[i] = sc.nextInt();
			if(point[i] < 40)
				point[i] = 40;
		}
		
		int sum = 0;
		for(int i : point) {
			sum+=i;
		}
		System.out.println(sum/5);
		
		
	}

}
