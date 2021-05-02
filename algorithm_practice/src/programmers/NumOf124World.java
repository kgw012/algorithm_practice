package programmers;

public class NumOf124World {

    public String solution(int n) {
    	
    	StringBuilder sb = new StringBuilder();
    	while(n > 0) {
    		n--;
    		int num1 = n / 3;
    		int num2 = n % 3;
    		
    		switch(num2) {
    		case 0:
    			sb.append(1);
    			break;
    		case 1:
    			sb.append(2);
    			break;
    		case 2:
    			sb.append(4);
    			break;
    		}
    		n = num1;
    	}
    	
    	StringBuilder sb2 = new StringBuilder();
    	for(int i = 0; i < sb.length(); i++) {
    		sb2.append(sb.charAt(sb.length() - 1 - i));
    	}
    	return sb2.toString();
    }
}
