# Longest Substring with At Most Two Distinct Characters
### Solution code:
```
public class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null)
            return 0;
        if (s.length() <= 2)
            return s.length();
            
        char[] c = s.toCharArray();
        int lo = 0;
        int hi = 0;
        int res = 1;
        int len = 1;
        for(int i = 1; i < c.length; i++) {
            if (c[i] != c[lo] && c[i] != c[hi] && lo != hi) {
                
                res = Math.max(res, len);
                len = i - lo;
                lo = hi;
            }
            else {
                
                if (c[i] == c[lo]) {
                    
                    if (lo == hi)
                        lo = i;
                    else
                        lo = hi;
                }
                
                len++;
            }
            hi = i;
            
        }
        
        res = Math.max(res, len);
        return res;
    }
}
```

### Test case:
```
"eceba"
```
```
"aabbaabbaccccccc"
```
```
""
```
```
"aa"
```
```
"ab"
```
