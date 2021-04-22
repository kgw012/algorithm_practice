package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1931 {
	
	private static class Room{
		int st, fn;

		public Room(int st, int fn) {
			super();
			this.st = st;
			this.fn = fn;
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Room[] arr = new Room[n];
		
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			arr[i] = new Room(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}
		
		Arrays.sort(arr, new Comparator<Room>() {
			@Override
			public int compare(Room r1, Room r2) {
				if(r1.fn > r2.fn) return 1;
				if(r1.fn == r2.fn) {
					if(r1.st > r2.st) return 1;
					if(r1.st == r2.st)return 0; 
				}
				return -1;
			}
			
		});
		
		int time = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(time <= arr[i].st) {
				time = arr[i].fn;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
