package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int k = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<k; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
			}
			System.out.println(sb);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	
	}

}