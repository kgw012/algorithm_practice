package programmers.dev_matching_2021;

public class RotateArrayBorder {

	public int[] solution(int rows, int columns, int[][] queries) {
    	int[][] map = new int[rows + 1][columns + 1];
    	
    	int cnt = 1;
    	for(int i = 1; i <= rows; i++) {
    		for(int j = 1; j <= columns; j++) {
    			map[i][j] = cnt++;
    		}
    	}
    	
    	int[] answer = new int[queries.length];
    	
    	for(int t = 0; t < queries.length; t++) {
    		int st_i = queries[t][0];
    		int st_j = queries[t][1];
    		int fn_i = queries[t][2];
    		int fn_j = queries[t][3];
    		
    		int min = Integer.MAX_VALUE;
    		
    		int input = map[st_i][st_j];
    		for(int j = st_j + 1; j <= fn_j; j++) {
    			if(input < min) min = input;
    			int save = map[st_i][j];
    			map[st_i][j] = input;
    			input = save;
    		}
    		for(int i = st_i + 1; i <= fn_i; i++) {
    			if(input < min) min = input;
    			int save = map[i][fn_j];
    			map[i][fn_j] = input;
    			input = save;
    		}
    		for(int j = fn_j - 1; j >= st_j; j--) {
    			if(input < min) min = input;
    			int save = map[fn_i][j];
    			map[fn_i][j] = input;
    			input = save;
    		}
    		for(int i = fn_i - 1; i >= st_i; i--) {
    			if(input < min) min = input;
    			int save = map[i][st_j];
    			map[i][st_j] = input;
    			input = save;
    		}
    		
    		answer[t] = min;
    	}
    	
        return answer;
    }
    
}
