package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class SortMyOpinion {
    public String[] solution(String[] strings, int n) {
    	
    	Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				char c1 = s1.charAt(n);
				char c2 = s2.charAt(n);
				
				if(c1 > c2) return 1;
				if(c1 < c2) return -1;
				
				return s1.compareTo(s2);
			}
    		
    	});
    	
        return strings;
    }
    
	public static void main(String[] args) {
		
		
	}

}