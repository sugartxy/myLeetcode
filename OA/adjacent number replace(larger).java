package LeetCode;

public class AdjacentII {

	private static int ajacent(String input) {
		int len = input.length();
		int[] digits = new int[len];
		for(int i = 0; i<len;i++) {
			digits[i]=input.charAt(i)-'0';
		}
		for(int i = 0; i<len-1;i++) {
			int replace = Math.max(digits[i],digits[i+1]);
			//base case
			if(i==len-2) {
				digits[i]=replace;
				digits[i+1]=-1;
				break;
			}
			if(replace>digits[i]) {
				digits[i]=replace;
				digits[i+1]=-1;
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< len; i++) {
			if(digits[i]!=-1) {
				sb.append(digits[i]);
			}
		}
		return Integer.parseInt(sb.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "623315";
		System.out.println(ajacent((input)));
	}
}
