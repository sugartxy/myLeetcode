package LeetCode;

public class LongestPath {
	private static int lengthLongestPath(String input) {
		System.out.println(input);
		String[] lines= input.split("\n");
		int[] levels = new int[lines.length+1];
		int ans = 0;
		for(int i = 0; i< lines.length;i++) {
			int level = lines[i].lastIndexOf("\t")+1;
			levels[level+1]= levels[level]+lines[i].length()-level+1;
			if(lines[i].contains(".")) {
				ans = Math.max(ans, levels[level+1]-1);
			}
		}
		for(int i:levels) {
			System.out.println(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "dir\n\tfile.txt";
		System.out.println(lengthLongestPath(input));
	}

}
