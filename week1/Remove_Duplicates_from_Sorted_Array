# Remove Duplicates from Sorted Array
### Solution code:
```
public class Solution {
    public int removeDuplicates(int[] nums) {

        int start = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                continue;
            }

            nums[start++] = nums[i+1];
        }
        
        return start;
    }
}
```

### Test case:
```
[-1,0,0,0,0,3,3]
[1,2,3,4,5]
[0,0,0,1,1,2,3]
[-1,-1,-2,-3,-4]
[1]
```
