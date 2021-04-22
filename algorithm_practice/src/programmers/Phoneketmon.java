package programmers;

import java.util.HashSet;

public class Phoneketmon {
    public int solution(int[] nums) {
    	HashSet<Integer> set = new HashSet<>();
    	
    	int n = nums.length;
    	for(int i = 0; i < n; i++) {
    		set.add(nums[i]);
    	}
    	
    	int max = set.size();
    	int answer = 0;
    	if(max > n / 2) answer = n / 2;
    	else answer = max;
    	
        return answer;
    }
    
	public static void main(String[] args) {
		
		
	}

}