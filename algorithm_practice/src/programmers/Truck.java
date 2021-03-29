package programmers;

import java.util.*;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i=0; i<bridge_length; i++){
            que.add(0);
        }
        
        int w = 0;
        int i = 0;
        int second = 0;
        while(true){
            if( weight >= (w - que.peek() + truck_weights[i]) ) {
                w -= que.poll();
                
                que.add(truck_weights[i]);
                w+=truck_weights[i];
                
                i++;
                second++;
                if(i>=truck_weights.length) break;
            }
            else {
                w -= que.poll();
                que.add(0);
                second++;
            }
        }
        
        second+=bridge_length;
        
        int answer = second;
        return answer;
    }
}