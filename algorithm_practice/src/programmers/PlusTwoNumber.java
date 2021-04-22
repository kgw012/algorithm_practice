package programmers;

public class PlusTwoNumber {

    public int[] solution(int[] numbers) {
    	
    	boolean[] arr = new boolean[201];
    	
    	for(int i = 0; i < numbers.length; i++) {
    		for(int j = i + 1; j < numbers.length; j++) {
    			arr[numbers[i] + numbers[j]] = true;
    		}
    	}
        
    	int cnt = 0;
    	for(int i = 0; i <= 200; i++) {
    		if(arr[i]) cnt++;
    	}
    	int[] answer = new int[cnt];
    	
    	cnt = 0;
    	for(int i = 0; i <= 200; i++) {
    		if(arr[i]) {
    			answer[cnt++] = i;
    		}
    	}
    	
        return answer;
    }
    
	public static void main(String[] args) {
		
		
	}

}