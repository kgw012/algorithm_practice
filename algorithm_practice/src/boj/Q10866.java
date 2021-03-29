package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Q10866 {
	
	private static class Deque{
		private int num;
		private int max;
		private int front;
		private int back;
		private int[] deq;
		
		public Deque(int capacity) {
			max = capacity;
			front = back = num = 0;
			deq = new int[max];
		}
		
		public void push_front(int x) {
			if(front<=0) front = max;
			deq[--front] = x;
			num++;
		}
		public void push_back(int x) {
			deq[back++] = x;
			if(back >= max) back = 0;
			num++;
		}
		
		public int pop_front() {
			if(num <= 0) return -1;
			else {
				int x = deq[front++];
				if(front >= max) front = 0;
				num--;
				return x;
			}
		}
		
		public int pop_back() {
			if(num <= 0) return -1;
			else {
				if(back <= 0) back = max;
				int x = deq[--back];
				num--;
				return x;
			}
		}
		
		public int size() {
			return num;
		}
		
		public int empty() {
			return num<=0 ? 1 : 0;
		}
		
		public int front() {
			if(num<=0) return -1;
			else return deq[front];
		}
		
		public int back() {
			if(num<=0) return -1;
			else{
				if(back <= 0) return deq[max-1];
				else return deq[back-1];
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Deque deq = new Deque(n);
		
		for(int i=0; i<n; i++) {
			String order = br.readLine();
			StringTokenizer st = new StringTokenizer(order);
			String s = st.nextToken();
			
			switch(s) {
			
			case "push_front" :
				int push_front = Integer.parseInt(st.nextToken());
				deq.push_front(push_front);
				break;
				
			case "push_back" :
				int push_back = Integer.parseInt(st.nextToken());
				deq.push_back(push_back);
				break;
				
			case "pop_front" :
				bw.write(deq.pop_front() + "\n");
				break;
				
			case "pop_back" :
				bw.write(deq.pop_back() + "\n");
				break;
				
			case "size" :
				bw.write(deq.size() + "\n");
				break;
				
			case "empty" :
				bw.write(deq.empty() + "\n");
				break;
				
			case "front" :
				bw.write(deq.front() + "\n");
				break;
				
			case "back" :
				bw.write(deq.back() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
