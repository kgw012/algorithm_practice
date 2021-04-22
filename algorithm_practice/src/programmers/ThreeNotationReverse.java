package programmers;

public class ThreeNotationReverse {

    public int solution(int n) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(n != 0) {
    		sb.append(Integer.toString(n % 3));
    		n /= 3;
    	}
    	
    	int answer = 0;
    	for(int i = 0; i < sb.length(); i++) {
    		answer += (Math.pow(3, sb.length() - i - 1) * (sb.charAt(i) - '0'));
    	}
    	
        return answer;
    }
    
	public static void main(String[] args) {
		
		
	}

}