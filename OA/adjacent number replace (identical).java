package LeetCode;

public class AdjacentIII {

	private static int ajacent(String input) {
		int len = input.length();
		int[] digits = new int[len];
		for(int i = 0; i<len;i++) {
			digits[i]=input.charAt(i)-'0';
		}
		boolean changed = false;
		for(int i = 0; i<len-1;i++) {
			if(digits[i]==digits[i+1]) {
				while(i<len-2&&digits[i]==digits[i+1]) {
					i++;
				}
				if(digits[i]<=digits[i+1]) {
					digits[i]=-1;
					changed = true;
					break;
				}
			}
		}
		if(!changed) {
			for(int i = len-1;i>0;i--) {
				if(digits[i]==digits[i-1]) {
					digits[i]=-1;
					changed = true;
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< len; i++) {
			if(digits[i]!=-1) {
				sb.append(digits[i]);
			}
		}
		//System.out.println(sb.toString());
		return Integer.parseInt(sb.toString());
	}
	public static int solution2(int x) {
		//need to check whether it is all unique
		if(x<11 || x>1000000000) {
			return -1;
		}
		String s = String.valueOf(x);
		int max = 0;
		char lastChar = s.charAt(0);
		for(int i = 1; i<s.length();i++) {
			char curChar = s.charAt(i);
			if(lastChar != curChar) {
				lastChar = curChar;
			}else {
				String sb = s.substring(0, i)+s.substring(i+1);
				max = Math.max(max, Integer.parseInt(sb));
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "544436668";
		System.out.println(ajacent((input)));
	}
}
