package programmers;

import java.util.*;

public class Tower {
    
    private static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        for(int i=1; i<heights.length; i++){
            Stack<Integer> stk = new Stack<>();
                for(int j=0; j<i; j++){
                    stk.push(heights[j]);
                }
            
            int count=1;
            while(!stk.isEmpty()) {
                if(stk.pop() > heights[i]){
                    answer[i] = i-count+1;
                    break;
                }
                count++;
            }  
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] test1 = {6, 9, 5, 7, 4};
    	int[] test2 = {3, 9, 9, 3, 5, 7, 2};
    	int[] test3 = {3, 9, 9, 3, 5, 7, 2};
    	
    	for(int i : solution(test1)) {
        	System.out.print(i + ",");
    	}
    	System.out.println();
    	for(int i : solution(test2)) {
    	  	System.out.print(i + ",");
    	}
    	System.out.println();
    	for(int i : solution(test3)) {
    	  	System.out.print(i + ",");
    	}
    	
    }
}