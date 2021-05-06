package programmers.kakao2021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class MenuRenewal {
	
	void dfs(HashMap<String, Integer> map, char[] order, int num, int count, boolean[] visit, int idx, StringBuilder sb) {
		if(count >= num) {
			String key = sb.toString();
			if(map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			}else {
				map.put(key, 1);
			}
			return;
		}
		
		for(int i = idx; i < order.length; i++) {
			if(visit[i]) continue;
			visit[i] = true;
			sb.append(order[i]);
			dfs(map, order, num, count + 1, visit, i + 1, sb);
			visit[i] = false;
			sb.delete(count, sb.length());
		}
	}
    public String[] solution(String[] orders, int[] course) {
    	
    	HashSet<String> answer_set = new HashSet<>();
    	
    	for(int i = 0; i < course.length; i++) {
    		int num = course[i];
    		
			HashMap<String, Integer> map = new HashMap<>();
    		for(int j = 0; j < orders.length; j++) {
    			char[] order = orders[j].toCharArray();
    			Arrays.sort(order);
    			boolean[] visit = new boolean[order.length];
    			dfs(map, order, num, 0, visit, 0, new StringBuilder());
    		}
    		
    		Iterator<String> map_it = map.keySet().iterator();
    		int max = 0;
    		HashSet<String> save_set = new HashSet<>();
    		while(map_it.hasNext()) {
    			String key = map_it.next();
    			int value = map.get(key);
    			
    			if(value > 1) {
        			if(value > max) {
        				max = value;
        				save_set.clear();
        				save_set.add(key);
        				continue;
        			}
        			if(value == max) {
        				save_set.add(key);
        			}
    			}
    		}
    		
    		Iterator<String> save_set_it = save_set.iterator();
    		while(save_set_it.hasNext()) {
    			answer_set.add(save_set_it.next());
    		}
    	}
    	
        String[] answer = new String[answer_set.size()];
        
        int i = 0;
        Iterator<String> answer_it = answer_set.iterator();
        while(answer_it.hasNext()) {
        	answer[i++] = answer_it.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
    public static void main(String[] args) {
    	String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
    	int[] course = {2, 3, 4};
    	
    	String[] answer = new MenuRenewal().solution(orders, course);
    	
    	for(int i = 0; i < answer.length; i++) {
    		System.out.println(answer[i]);
    	}
    }
}