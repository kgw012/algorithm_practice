package boj;

public class Q4673 {
	
	private static int dNum(int n) {
		
		char[] ch = Integer.toString(n).toCharArray();
		int dNum = n;
		for(int i=0; i<ch.length; i++) {
			dNum += ch[i]-'0';
		}
		
		return dNum;
	}
	
	private static int[] makeDNumArray(int n) {
		int[] ar = new int[5000];
		if(dNum(n) > 10000) {
			int[] arr = {};
			return arr;
		}
		ar[0] = dNum(n);
		int count = 1;
		
		for(int i=1; ; i++) {
			ar[i] = dNum(ar[i-1]);
			if(ar[i] >= 10000) {
				ar[i] = 0;
				break;
			}
			count++;
		}
		
		int[] dNumArr = new int[count];
		for(int i=0; ar[i]!=0; i++) {
			dNumArr[i] = ar[i];
		}
		
		return dNumArr;
	}
	
	private static int[] makeSNumArray() {
		int[] intArr = new int[10001];
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = i;
		}
		
		for(int i=1; i<=10000; i++) {
			int[] dNumArr = makeDNumArray(i);
			for(int j=0; j<dNumArr.length; j++) {
				intArr[dNumArr[j]] = 0;
			}
			
		}

		int count=0;
		for(int i=0; i<intArr.length; i++) {
			if(intArr[i] != 0) {
				count++;
			}
		}
		int[] sNumArr = new int[count];
		for(int i=0; i<sNumArr.length; i++) {
			for(int j=0; j<intArr.length; j++) {
				if(intArr[j] != 0) {
					sNumArr[i] = intArr[j];
					intArr[j] = 0;
					break;
				}
			}
		}
		return sNumArr;
	}
	
	
	public static void main(String[] args) {
		
		int[] sNumArr = makeSNumArray();
		for(int i :sNumArr) {
			System.out.println(i);
		}
	}

}