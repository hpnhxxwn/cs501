# Partition Array
### Solution code:
```
public class Solution {
    public int[] PartionArray(int[] nums, int target) {

        int start = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target) {
                int tmp = nums[start];
		nums[start++] = nums[i];
		nums[i] = tmp;
            }
        }

        return nums;
    }
}
```
