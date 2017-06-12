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

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-10%20%E4%B8%8B%E5%8D%885.03.53.png?raw=true)
