package programmers;

public class RemoveMinValue {

    public int[] solution(int[] arr) {
    	if(arr.length == 1) {
    		return new int[] {-1};
    	}
    	
    	int min = Integer.MAX_VALUE;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] < min) min = arr[i];
    	}
    	
    	int cnt = 0;
        int[] answer = new int[arr.length - 1];
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] == min) continue;
    		answer[cnt++] = arr[i];
    	}
        return answer;
    }
    
}
