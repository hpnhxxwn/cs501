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

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-11%20%E4%B8%8B%E5%8D%8811.14.46.png?raw=true)
