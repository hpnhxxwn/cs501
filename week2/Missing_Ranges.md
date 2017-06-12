# Missing Ranges
### Solution code:
```
public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            if (lower == upper) {
                res.add(String.valueOf(lower));
            }
            else
                res.add(String.valueOf(lower) + "->" + String.valueOf(upper));
            return res;
        }
        
        if (nums[0] > lower) {
            if (nums[0] - 1 == lower) 
                res.add(String.valueOf(nums[0] - 1));
            else 
                res.add(String.valueOf(lower) + "->" + String.valueOf(nums[0] - 1));
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] > 1) {
                if (nums[i-1] + 1 == nums[i] - 1) {
                    res.add(String.valueOf(nums[i-1] + 1));
                }
                else {
                    res.add(String.valueOf(nums[i-1] + 1) + "->" + String.valueOf(nums[i] - 1));
                }
            }
            else if (nums[i] - nums[i-1] <= -1) {
                res.add(String.valueOf(nums[i-1] + 1) + "->" + String.valueOf(nums[i] - 1));
            }
        }
        
        if (upper > nums[nums.length - 1]) {
            if (upper - 1 == nums[nums.length - 1]) 
                res.add(String.valueOf(upper));
            else 
                res.add(String.valueOf(nums[nums.length - 1] + 1) + "->" + String.valueOf(upper));
        }
        return res;
    }
}
```

### Test case:
```
[0,1,3,50,75]
0
99
```
```
[0,1,3,50,99]
0
99
```
```
[0,1,3,50,98]
0
99
```
```
[1,3,50,75]
0
99
```
```
[2,3,50,75]
0
99
```
