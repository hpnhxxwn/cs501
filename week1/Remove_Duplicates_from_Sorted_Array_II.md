# Remove Duplicates from Sorted Array II 
### Solution code;
```
public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int n: nums) {
            if (result < 2 || n != nums[result-2]) {
                nums[result++] = n;
                //System.out.println(n);
            }
            
        }
        
        return result;
    }
}
```

### Test case:
```
[-1,0,0,2,3,3,3]
[-1,0,2,2,3,3,3,3,3]
[-1,0,0,2,2,3,3,3,3,3]
[-1,0,2,2,3,3,3]
[1,1,1,2,2,3]
```
