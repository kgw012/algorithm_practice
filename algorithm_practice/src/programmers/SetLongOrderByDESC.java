package programmers;

public class SetLongOrderByDESC {

    public long solution(long n) {
    	int[] count_arr = new int[10];
    	while(n > 0) {
    		int num = (int)(n % 10);
    		count_arr[num]++;
    		n /= 10;
    	}
    	
    	String s = "";
    	for(int i = 9; i >= 0; i--) {
    		for(int j = 0; j < count_arr[i]; j++) {
        		s += Long.toString(i);
    		}
    	}
    	
        long answer = Long.parseLong(s);
        return answer;
    }
}
