package boj;

public class Q4673_2 {
	
	private static int dNum(int n) {
		char[] ch = Integer.toString(n).toCharArray();
		int dNum=n;
		for(int i=0; i<ch.length; i++) {
			dNum+=ch[i]-'0';
		}
		return dNum;
	}
	
	public static void main(String[] args) {
		int[] dArr = new int[10036];
		
		for(int i=1; i<=10000; i++) {
			dArr[dNum(i)] = 1;
			if(dArr[i]!=1) System.out.println(i);
		}
		
	}

}
