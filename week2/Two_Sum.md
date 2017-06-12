# Two Sum
### Solution code:
```
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}
```

### Test case:
```
[3,2,4]
6
```
```
[]
6
```
```
[3,2,1,1,2,4]
6
```
```
[3,2,4]
0
```
```
[3,3,3]
6
```
