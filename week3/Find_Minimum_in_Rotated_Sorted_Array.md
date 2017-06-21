# Find Minimum in Rotated Sorted Array
### Solution code:
```
public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int lo = 0;
        int hi = nums.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[nums.length - 1])
                lo = mid;
            else 
                hi = mid;
            
        }
        if (nums[lo] < nums[hi])
            return nums[lo];
        else
            return nums[hi];
    }
}
```

### Test case:
```
[0,1,2,3,4,5,6]
```
```
[4,5,6,7,0,1,2]
```
```
[0]
```
```
[]
```
