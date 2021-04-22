package programmers;

import java.util.Arrays;

public class TrainingShirts {

    public int solution(int n, int[] lost, int[] reserve) {
    	
    	boolean[] arr = new boolean[n + 1];
    	for(int i = 1; i <= n; i++) {
    		arr[i] = true;
    	}
    	
    	for(int i = 0; i < lost.length; i++) {
    		arr[lost[i]] = false;
    	}
    	
    	Arrays.sort(reserve);
    	
    	for(int i = 0; i < reserve.length; i++) {
    		int num = reserve[i];
    		if(!arr[num]) {
    			arr[num] = true;
    			reserve[i] = -1;
    		}
    	}
    	
    	for(int i = 0; i < reserve.length; i++) {
    		int num = reserve[i];
    		
    		if(num == -1) continue;
    		
    		if(num > 1 && !arr[num - 1]) {
    			arr[num - 1] = true;
    			continue;
    		}
    		
    		if(num < n && !arr[num + 1]) {
    			arr[num + 1] = true;
    		}
    	}
    	
    	int answer = 0;
    	for(int i = 1; i <= n; i++) {
    		if(arr[i]) answer++;
    	}
    	
        return answer;
    }
    
	public static void main(String[] args) {
		
	}

}