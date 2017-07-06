# Paint House II
### 40.86%
### Solution:
```
public class Solution {
    public int minCostII(int[][] costs) {
        if (costs == null || costs.length == 0) return 0;
        
        int n = costs.length, k = costs[0].length;
        // min1 is the index of the 1st-smallest cost till previous house
        // min2 is the index of the 2nd-smallest cost till previous house
        int min1 = -1, min2 = -1;
        int [][] dp = new int[n][k];
        
        for (int i = 0; i < n; i++) {
            int last1 = min1, last2 = min2;
            min1 = -1; min2 = -1;

            for (int j = 0; j < k; j++) {
                if (j != last1) {
                    // current color j is different to last min1
                    dp[i][j] = last1 < 0 ? costs[i][j] : dp[i - 1][last1] + costs[i][j];
                } else {
                    dp[i][j] = last2 < 0 ? costs[i][j] : dp[i - 1][last2] + costs[i][j];
                }

                // find the indices of 1st and 2nd smallest cost of painting current house i
                if (min1 < 0 || dp[i][j] < dp[i][min1]) {
                    min2 = min1; min1 = j;
                } else if (min2 < 0 || dp[i][j] < dp[i][min2]) {
                    min2 = j;
                }
            }
        }

        return dp[n - 1][min1];
    }
}
```
