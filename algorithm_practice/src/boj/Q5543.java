package boj;

import java.util.Scanner;

public class Q5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		
		int[] a = {a1,a2,a3};
		int[] b = {b1,b2};
		
		int min = a[1]+b[1]-50;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				int price = a[i]+b[j]-50;
				if(min>price) min=price;
			}
		}
		System.out.println(min);
	}

}
