package programmers;

public class CaesarCipher {

    public String solution(String s, int n) {
    	char[] arr = new char[s.length()];
    	
    	for(int i = 0; i < arr.length; i++) {
    		char c = s.charAt(i);
    		if(c == ' ') {
    			arr[i] = c;
    			continue;
    		}
    		
    		int offset = 'A';
    		if(Character.isLowerCase(c)) offset = 'a';
    		int tmp = (int)c - offset;
			tmp = (tmp + n) % 26;
			arr[i] = (char)(tmp + offset);
    	}
    	
        return String.copyValueOf(arr);
    }
}
