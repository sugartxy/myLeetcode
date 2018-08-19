package LeetCode;

public class LongestPathII {

	private static String lengthLongestPath(String input) {
		System.out.println(input);
		String[] lines= input.split("\n");
		String[] levels = new String[lines.length+1];
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i< lines.length;i++) {
			int level = lines[i].lastIndexOf(" ")+1;
			levels[level]= lines[i].trim();
			if(lines[i].endsWith(".jpeg")||lines[i].endsWith(".gif")||lines[i].endsWith(".png")) {
				StringBuilder cur = new StringBuilder();
				for(int j = 0;j<level;j++) {
					cur.append("/");
					cur.append(levels[j].trim());
				}
				if(!ans.toString().equals(cur.toString())){
					ans.append(cur);
				}
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		System.out.println(lengthLongestPath(input));
	}

}
