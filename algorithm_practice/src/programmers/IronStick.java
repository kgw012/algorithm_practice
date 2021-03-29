package programmers;

import java.util.*;

public class IronStick {
    public int solution(String arrangement) {
        Queue<Character> que = new LinkedList<Character>();
        for(int i=0; i<arrangement.length(); i++){
            que.add(arrangement.charAt(i));
        }
        
        int bars = 0;
        int answer = 0;
        while(que.size()>0){
            switch(que.poll()){
                case '(' :
                    if( que.peek() == ')' ){
                        answer += bars;
                        que.poll();
                    }
                    else{
                        bars++;
                    }
                    break;
                    
                case ')' :
                    answer++;
                    bars--;
                    break;
            }
        }
        
        return answer;
    }
}
