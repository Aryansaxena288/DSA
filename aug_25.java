import java.util.*;

class Solution {
    public static boolean dfs(char c1[], char c2[], char c3[], int i, int j, int k, boolean dp[][]) {
        if (dp[i][j]) {
            return false;
        }
        if (k == c3.length) {
            return true;
        }
        boolean valid = i < c1.length && c1[i] == c3[k] && dfs(c1, c2, c3, i + 1, j, k + 1, dp)
                || j < c2.length && c2[j] == c3[k] && dfs(c1, c2, c3, i, j + 1, k + 1, dp);
        if (!valid) {
            dp[i][j] = true;
        }
        return valid;
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        char c1[] = s1.toCharArray(), c2[] = s2.toCharArray(), c3[] = s3.toCharArray();
        int m = s1.length(), n = s2.length();
        if (m + n != s3.length()) {
            return false;
        }
        boolean dp[][] = new boolean[m + 1][n + 1];
        return dfs(c1, c2, c3, 0, 0, 0, dp);

    }
}a