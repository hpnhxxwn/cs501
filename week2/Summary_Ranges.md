# Summary Ranges
### Solution code:
```
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<String>();
            
        List<String> res = new ArrayList<String>();
        
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1] + 1) {
                if (start == i-1) {
                    res.add(String.valueOf(nums[i-1]));
                }
                else {
                    res.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[i-1]));
                }
                start = i;
            }
        }
        if (start == nums.length-1) {
            res.add(String.valueOf(nums[start]));
        }
        else {
            res.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[nums.length-1]));
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
[1,2,3,4,5,7]
```
```
[1,3,4,5,7]
```
```
[1,2]
```
```
[1,3,5,7,9]
```
