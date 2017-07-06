# Perfect Squares
### 90.20%
### Solution:
```
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        
        for (int i = 1; i < n + 1; i++) {       
            
            int c = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                int tmp = dp[i-j*j] + 1;
                c = Math.min(tmp, c);
            }
            dp[i] = c;
            
            
        }
        return dp[n];
    }
}
```
