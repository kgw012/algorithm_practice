package programmers.kakao2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FailRate {
	
	private static class Stage{
		int stage_num;
		int notClear = 0;
		int n = 0;
	}

    public int[] solution(int N, int[] stages) {
        ArrayList<Stage> list = new ArrayList<>();
        for(int i = 1; i <= N + 1; i++) {
        	Stage stage = new Stage();
        	stage.stage_num = i;
        	list.add(stage);
        }
        
        for(int i = 0; i < stages.length; i++) {
        	int stage_num = stages[i];
        	for(int j = 1; j <= stage_num; j++) {
        		list.get(j - 1).n++;
        	}
    		list.get(stage_num - 1).notClear++;
        }
        
        list.remove(N);
        
        Collections.sort(list, new Comparator<Stage>() {

			@Override
			public int compare(Stage s1, Stage s2) {
				double rate1 = (double)s1.notClear / (double)s1.n;
				double rate2 = (double)s2.notClear / (double)s2.n;
				if(rate1 < rate2) return 1;
				if(rate1 > rate2) return -1;
				return s1.stage_num - s2.stage_num;
			}
        	
        });

        int[] answer = new int[N];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i).stage_num;
        }
        
        return answer;
    }

}
