package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Q11651 {
	static class Point{
		int x, y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Point[] arr = new Point[n];
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] tmp = s.split(" ");
			arr[i] = new Point(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]));
		}
		
		Arrays.sort(arr, new Comparator<Point>() {

			@Override
			public int compare(Point p1, Point p2) {
				if(p1.y > p2.y) return 1;
				if(p1.y < p2.y) return -1;
				if(p1.x > p2.x) return 1;
				if(p1.x < p2.x) return -1;
				return 0;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(arr[i].x + " " + arr[i].y + "\n");
		}
		System.out.println(sb);
	}

}
