package programmers.dev_matching_2021;

import java.util.HashMap;

public class PyramidToothBrushSell {
	
	private static class Node{
		String name;
		String referral;
		int price = 0;
		
	}

	public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
    	HashMap<String, Node> map = new HashMap<>();
    	
    	for(int i = 0; i < enroll.length; i++) {
    		Node node = new Node();
    		node.name = enroll[i];
    		node.referral = referral[i];
    		
    		map.put(node.name, node);
    	}
    	
    	for(int i = 0; i < seller.length; i++) {
    		Node node = map.get(seller[i]);
    		int price = amount[i] * 100;
    		
    		while(true) {
    			String ref = node.referral;
    			
        		int ref_price = price / 10;
        		int my_price = price - ref_price;

    			if(ref.equals("-")) {
    				node.price += my_price;
    				break;
    			}
    			
        		node.price += my_price;
        		price = ref_price;
        		
    			node = map.get(ref);
    		}
    	}
    	
    	int[] answer = new int[enroll.length];
    	
    	for(int i = 0; i < enroll.length; i++) {
    		answer[i] = map.get(enroll[i]).price;
    	}
    	
        return answer;
    }
}
