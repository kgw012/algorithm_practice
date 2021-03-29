package boj;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int H2 = H;
		int M2 = M-45;
		
		if(M2>=0) {
			System.out.println(H2 + " " + M2);
		}
		else if(H==0) {
			H2=23;
			M2+=60;
			System.out.println(H2 + " " + M2);
		}
		else {
			H2--;
			M2+=60;
			System.out.println(H2 + " " + M2);
		}
		sc.close();
	}

}