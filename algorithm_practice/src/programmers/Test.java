package programmers;

import java.util.ArrayList;

class Node{
	int idx;
	int value;
	ArrayList<Node> chain_list = new ArrayList<>();
	
}

public class Test {

	private static long answer = 0;
	private static Node[] node_arr;
	private static ArrayList<Integer> ptr_list = new ArrayList<>();
	
	private static boolean dfs(Node node) {
		if(node.chain_list.size() > 1) {
			return false;
		}
		if(node.chain_list.size() == 0) {
			return true;
		}
		
		
		Node next_node = node_arr[node.chain_list.get(0).idx];
		
		for(int i = 0; i < next_node.chain_list.size(); i++) {
			if(next_node.chain_list.get(i).idx == node.idx) {
				next_node.chain_list.remove(i);
				break;
			}
		}

		next_node.value += node.value;
		answer += Math.abs(node.value);
		
		dfs(next_node);
		
		return false;
	}

    public static long solution(int[] a, int[][] edges) {
    	node_arr = new Node[a.length];
    	int sum = 0;
    	for(int i = 0; i < a.length; i++) {
    		Node node = new Node();
    		node.idx = i;
    		node.value = a[i];
    		sum += a[i];
    		node_arr[i] = node;
    	}
    	
    	if(sum != 0) return -1;
    	
    	for(int i = 0; i < edges.length; i++) {
    		int idx1 = edges[i][0];
    		int idx2 = edges[i][1];
    		
    		node_arr[idx1].chain_list.add(node_arr[idx2]);
    		node_arr[idx2].chain_list.add(node_arr[idx1]);
    	}
    	
    	for(int i = 0; i < node_arr.length; i++) {
    		if(node_arr[i].chain_list.size() == 1) {
        		ptr_list.add(i);
    		}
    	}
    	
    	for(int i = 0; i < ptr_list.size(); i++) {
    		Node node = node_arr[ptr_list.get(i)];
    		if(dfs(node)) {
    			return answer;
    		}
    	}
    	
        return answer;
    }
    
	public static void main(String[] args) {
		int[] a = {-5,0,2,1,2};
		int[][] edges = {{0,1},{3,4},{2,3},{0,3}};
		
		System.out.println(solution(a, edges));
	}

}