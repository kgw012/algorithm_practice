package programmers;

import java.util.*;

public class IronStick2 {
    public int solution(String arrangement) {
        Stack<Integer> stk = new Stack<>();
        
        int answer = 0;
        for(int i=0; i<arrangement.length(); i++){
            if(arrangement.charAt(i) == '('){
                stk.push(i);
            }
            else if( arrangement.charAt(i) == ')'){
                if(stk.peek() + 1 == i){
                    stk.pop();
                    answer += stk.size();
                }
                else{
                    answer++;
                }
            }
        }
        
        return answer;
    }
}