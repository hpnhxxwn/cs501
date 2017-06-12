# 3Sum Closest
### Solution code:
```
public class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < n-2; i++) {
            int p1 = i + 1;
            int p2 = n - 1;
            while (p1 < p2) {
                sum = nums[i] + nums[p1] + nums[p2];
                if (sum == target) {
                    return target;
                }
                else {
                    int delta = Math.abs(sum - target);
                    if (min > delta) {
                        result = sum;
                        min = delta;
                    }
                    if (sum > target)
                        p2--;
                    else
                        p1++;
                }
            }
        }
        return result;
    }
}
```

### Test case:
```
[0,0,0]
1
```
```
[-1,2,1,-4]
1
```
```
[-1,2,0,-4]
1
```
```
[]
1
```
```
[1,2]
2
```
