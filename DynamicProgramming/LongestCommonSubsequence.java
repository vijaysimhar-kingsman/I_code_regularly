package DynamicProgramming;


public class LongestCommonSubsequence {
	static void lcs(String s1 , String s2) {
		int n= s1.length();
		int m = s2.length();
		int dp[][]=new int[n+1][m+1];

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
				else dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}int len = dp[n][m];
		StringBuffer ss = new StringBuffer("");
		int i =n;int j =m;
		while(i>0 && j>0 && ss.length()<=len) {
			if(s1.charAt(i-1)==s2.charAt(j-1)) {
				ss.append(s1.charAt(i-1));
				i--;j--;
			}else if(dp[i-1][j]>dp[i][j-1]) {
				i--;
			}else {
				j--;
			}
		}System.out.println(ss.reverse());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 ="bdgek";
		lcs(s1,s2);
	}

}
