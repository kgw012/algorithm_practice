package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q10814 {
	
	static class Member{
		int age;
		String name;
		int reg_date;
		
		public Member(int age, String name, int reg_date) {
			super();
			this.age = age;
			this.name = name;
			this.reg_date = reg_date;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Member[] arr = new Member[n];
		for(int i = 0; i < n; i++) {
			String[] s_arr = br.readLine().split(" ");
			int age = Integer.parseInt(s_arr[0]);
			String name = s_arr[1];
			arr[i] = new Member(age, name, i);
		}
		
		Arrays.sort(arr, new Comparator<Member>() {

			@Override
			public int compare(Member m1, Member m2) {
				if(m1.age > m2.age) return 1;
				if(m1.age == m2.age) {
					if(m1.reg_date > m2.reg_date) return 1;
				}
				
				return -1;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[i].age + " " + arr[i].name + "\n");
		}
		
		System.out.println(sb);
	}

}
