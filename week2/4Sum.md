# 4Sum
### Solution code:
```
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4)
            return result;
        Arrays.sort(nums);
        int n = nums.length;
            
        for (int i = 0; i < n-3; i++) {
            if (nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target)
                break;
            if (nums[i] + nums[n-1] + nums[n-2] + nums[n-3] < target)
                continue;
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            for (int j = i+1; j < n-2; j++) {
                if (nums[i] + nums[j] + nums[j+1] + nums[j+2] > target)
                    break;
                if (nums[i] + nums[j] + nums[n-1] + nums[n-1] < target)
                    continue;
                if (j > i+1 && nums[j] == nums[j-1])
                    continue;
                int p1 = j+1;
                int p2 = n-1;
                
                while (p1 < p2) {
                    int sum = nums[i] + nums[j] + nums[p1] + nums[p2];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p1], nums[p2]));
                        while (p1 < p2 && nums[p1] == nums[p1+1]) p1++;
                        while (p1 < p2 && nums[p2] == nums[p2-1]) p2--;
                        p1++;
                        p2--;
                    }
                    else if (sum > target) {
                        p2--;
                    }
                    else {
                        p1++;
                    }
                }
            }
        }
        return result;
    }
}
```

### Test case:
```
[1,0,-1,0,-2,2]
0
```
```
[]
0
```
```
[-1,-2]
0
```
```
[-4,-1,-2]
0
```
```
[-4,-2,-1,3]
0
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-11%20%E4%B8%8B%E5%8D%8810.46.42.png?raw=true)
