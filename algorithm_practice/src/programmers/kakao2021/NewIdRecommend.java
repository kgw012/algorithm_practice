package programmers.kakao2021;

public class NewIdRecommend {

	public static String solution(String new_id) {
		new_id = new_id.toLowerCase();
		
		String tmp = "";
		for(int i = 0; i < new_id.length(); i++) {
			char c = new_id.charAt(i);
			if(!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.')) {
				continue;
			}
			tmp += c;
		}
		
		String tmp2 = "";
		for(int i = 0; i < tmp.length(); i++) {
			char c = tmp.charAt(i);
			if(tmp2.length() != 0 && c == '.' && tmp2.charAt(tmp2.length() - 1) == '.') {
				continue;
			}
			tmp2 += c;
		}
		
		if(tmp2.length() != 0 && tmp2.charAt(0) == '.') {
			tmp2 = tmp2.substring(1);
		}
		if(tmp2.length() != 0 && tmp2.charAt(tmp2.length() - 1) == '.') {
			tmp2 = tmp2.substring(0, tmp2.length() - 1);
		}
		
		if(tmp2.length() == 0) {
			tmp2 = "a";
		}
		
		if(tmp2.length() >= 16) {
			tmp2 = tmp2.substring(0, 15);
		}

		if(tmp2.length() != 0 && tmp2.charAt(tmp2.length() - 1) == '.') {
			tmp2 = tmp2.substring(0, tmp2.length() - 1);
		}
		
		if(tmp2.length() <= 2) {
			while(tmp2.length() < 3) {
				tmp2 += tmp2.charAt(tmp2.length() - 1);
			}
		}
		
        return tmp2;
    }
    
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(solution(new_id));
	}

}
