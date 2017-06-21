# Find Peak Element
### Solution code:
```
public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 1)
            return 0;
            
        int lo = 0;
        int hi = nums.length - 1;
        
        while(lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] >= nums[mid + 1])
                return mid;
            else if (nums[mid] > nums[mid + 1] && nums[mid] < nums[mid - 1])
                hi = mid;
            else
                lo = mid;
        }
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] >= nums[lo] && nums[mid] >= nums[hi])
            return mid;
        else if (nums[mid] < nums[lo])
            return lo;
        else 
            return hi;
    }
}
```

### Test case:
```
[1]
```
```
[1,2,3,1]
```
```
[1,2,2,1]
```
```
[]
```
```
[4,3,2,1]
```
