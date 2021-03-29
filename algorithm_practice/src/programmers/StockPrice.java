package programmers;

import java.util.*;

class StockPrice {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length-1; i++){
            int sec = 1;
            int j = i+1;
            while(prices[i] <= prices[j]){
                j++;
                if(j>=prices.length) break;
                sec++;
            }
            answer[i] = sec;
        }
        return answer;
    }
}