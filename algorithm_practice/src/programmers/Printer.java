package programmers;

import java.util.*;

class Document{
    int idx;
    int pri;
    
    public Document(int idx, int pri){
        this.idx = idx;
        this.pri = pri;
    }
}

public class Printer {
    private static boolean isMax(Queue<Document> que){
        int max = que.peek().pri;
        for(int i=0; i<que.size(); i++){
            if(max < que.peek().pri) max = que.peek().pri;
            que.add(que.poll());
        }
        return max==que.peek().pri;
    }
    
    public int solution(int[] priorities, int location) {
        Queue<Document> que = new LinkedList<Document>();
        
        for(int i=0; i<priorities.length; i++){
            que.add(new Document(i, priorities[i]));
        }
        
        int count = 1;
        while(true){
            if(isMax(que)){
                if(que.peek().idx == location) break;
                que.poll();
                count++;
            }
            else{
                que.add(que.poll());
            }
        }
        
        return count;
    }
}