# Path Sum III
### Solution code:
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        return helper(root, 0, sum, map);
    }
    
    public int helper(TreeNode node, int currSum, int sum, Map<Integer, Integer> map) {
        if (node == null)
            return 0;
        currSum += node.val;
        int res = map.getOrDefault(currSum - sum, 0);
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        
        res += helper(node.left, currSum, sum, map);
        res += helper(node.right, currSum, sum, map);
        map.put(currSum, map.get(currSum) - 1);
        return res;
    }
}
```

### Test case:
```
[10,5,-3,3,2,null,11,3,-2,null,1]
8
```
```
[]
3
```
```
[1,2,3,4,5]
10
```
```
[5,4,8,11,null,13,4,7,2,null,null,5,1]
22
```


