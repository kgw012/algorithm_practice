package programmers.dev_matching_2021;

public class LottoMaxMinRank {

    public int[] solution(int[] lottos, int[] win_nums) {
    	
    	int min = 0;
    	int cnt = 0;
    	
    	for(int i = 0; i < lottos.length; i++) {
    		int num = lottos[i];
    		if(num == 0) {
    			cnt++;
    			continue;
    		}
    		for(int j = 0; j < win_nums.length; j++) {
    			if(num == win_nums[j]) {
    				min++;
    				break;
    			}
    		}
    	}
    	
    	int[] answer = new int[2];
    	answer[0] = 7 - (min + cnt);
    	answer[1] = 7 - min;
    	
    	for(int i = 0; i < answer.length; i++) {
    		if(answer[i] >= 6) answer[i] = 6;
    	}
    	
        return answer;
    }
    
}
