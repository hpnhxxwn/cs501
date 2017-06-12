# 3Sum
### Brute force solution, very ugly, have to consider duplicates:
```
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length < 3)
            return result;
        Set<Integer> map = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] tmpInt = new int[3];
                        tmpInt[0] = nums[i];
                        tmpInt[1] = nums[j];
                        tmpInt[2] = nums[k];
                        Arrays.sort(tmpInt);
                        int sum = 100 * tmpInt[0] + 10 * tmpInt[1] + tmpInt[2]; 
                        
                        if (map.contains(sum)) {
                                break;
                        }
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);

                        map.add(sum);

                        result.add(tmp);
                    }
                        
                }
            }
        }
        
        return result;
    }
}
```

### Optimized solution:
```
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length < 3)
            return result;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {

                    if (nums[j] + nums[k] == -nums[i]) {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        tmp.add(nums[i]);
                        result.add(tmp);
                        
                        while(j < k && nums[j] == nums[j+1]) j++;
                        while (j < k && nums[k] == nums[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if (nums[j] + nums[k] > -nums[i])
                        k--;
                    else
                        j++;
                }
            }
            
        }
        
        return result;
    }
}
```

### Test case:
```
[-1,0,1,2,-1,-4]
```
```
[-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6]
```
```
[1,-1,-1,0]
```
```
[0,0,0]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-11%20%E4%B8%8A%E5%8D%881.09.26.png?raw=true)
