package boj;

import java.math.BigInteger;
import java.util.Scanner;

public class Q10757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		BigInteger value1 = new BigInteger(a);
		BigInteger value2 = new BigInteger(b);
		System.out.println(value1.add(value2));
		sc.close();
		
	}

}