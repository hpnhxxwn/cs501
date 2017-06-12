# Container With Most Water
### Solution code:
```
public class Solution {
    public int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        
        int p1 = 0;
        int p2 = height.length - 1;
        
        while (p1 < p2) {
            result = Math.max(result, (p2 - p1) * Math.min(height[p1], height[p2]));
            if (height[p1] < height[p2]) 
                p1++;
            else
                p2--;
        }
        
        return result;
    }
}
```

### Test case:
```
[1,1]
```
```
[1,2,3,2,1,6,4]
```
```
[1,2,3,2,1,6,2]
```
```
[1,2,1,2]
```
```
[0,0]
```
