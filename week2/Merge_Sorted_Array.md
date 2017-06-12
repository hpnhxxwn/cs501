# Merge Sorted Array
### Solution code:
```
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
            
        int i = m-1;
        int j = n-1;
        int idx = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] >= nums1[i]) {
                nums1[idx--] = nums2[j--];
                
            }
            else {
                nums1[idx--] = nums1[i--];
            }
        }
        while (j >= 0) {
            nums1[idx--] = nums2[j--];
        }
    }
}
```

### Test case:
```
[1]
1
[]
0
```
```
[1,0,0,0]
1
[2,3,4]
3
```
```
[2,3,4,0]
3
[1]
1
```
```
[]
0
[]
0
```
```
[2,3,4,0,0,0,0]
3
[1,4,6,9]
4
```
