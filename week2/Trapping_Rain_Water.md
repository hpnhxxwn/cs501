# Trapping Rain Water
### Solution code:
```
public class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int h = 0; 
        int res = 0;
        while (l < r) {

            if (height[l] < height[r]) {
                h = Math.max(h, height[l]);
                res+= h - height[l];
                l++;
            }
            else {
                h = Math.max(h, height[r]);
                res+= h - height[r];
                r--;
            }
            
        }
        return res;
    }
}
```

### Test case:
```
[]
```
```
[0,1,0,2,1,0,1,3,2,1,2,1]
```
```
[0,1,2,2,3,3,3,3,4,4,4,1]
```
```
[0,1,2,2,3,0,3,3,4,4,4,1]
```
```
[4,3,2,1,0,1,2,3,4]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-11%20%E4%B8%8A%E5%8D%8812.24.18.png?raw=true)
