package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stk = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] s_arr = s.split(" ");
			
			if(s_arr[0].equals("push")) {
				stk.push(Integer.parseInt(s_arr[1]));
				continue;
			}
			
			if(s_arr[0].equals("pop")) {
				if(stk.isEmpty()) {
					sb.append("-1\n");
				}else {
					int num = stk.pop();
					sb.append(num).append('\n');
				}
				
				continue;
			}
			
			if(s_arr[0].equals("size")) {
				sb.append(stk.size()).append('\n');
				continue;
			}
			
			if(s_arr[0].equals("empty")) {
				if(stk.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				continue;
			}
			
			if(s_arr[0].equals("top")) {
				if(stk.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(stk.peek()).append('\n');
				}
				
				continue;
			}
		}
		
		
		System.out.println(sb);
	}
}
