package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q18258 {
	
	private static class Queue{
		private int[] que;
		private int front;
		private int rear;
		private int max;
		private int num;
		
		//»ý¼ºÀÚ
		public Queue(int capacity) {
			max = capacity;
			que = new int[max];
			front = rear = num = 0;
		}
		
		//push
		public int push(int x) {
			que[rear++] = x;
			if(rear == max) rear = 0;
			num++;
			return x;
		}
		
		
		//pop
		public int pop() {
			
			int x;
			if(num <= 0) x = -1;
			else {
				x = que[front++];
				if(front == max) front = 0;
				num--;
			}
			
			return x;
		}
		
		//size
		public int size() {
			return num;
		}
		
		//empty
		public int empty() {
			if(num<=0) return 1;
			else return 0;
		}
		
		//front
		public int front() {
			int x;
			if(num <= 0) x = -1;
			else x = que[front];
			return x;
		}
		
		//back
		public int back() {
			int x;
			if(num<=0) x = -1;
			else {
				if(rear <= 0)
					x = que[max-1];
				else x = que[rear-1];
			}
			return x;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Queue que = new Queue(n);
		
		for(int i=0; i<n; i++) {
			String order = br.readLine();
			StringTokenizer st = new StringTokenizer(order);
			
			switch(st.nextToken()) {
			
			case "push" :
				que.push(Integer.parseInt(st.nextToken()));
				break;
			
			case "pop" :
				bw.write(que.pop() + "\n");
				break;
				
			case "size" :
				bw.write(que.size() + "\n");
				break;
				
			case "empty" :
				bw.write(que.empty() + "\n");
				break;
				
			case "front" :
				bw.write(que.front() + "\n");
				break;
				
			case "back" :
				bw.write(que.back() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();

	}

}
