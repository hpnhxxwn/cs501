# Sum Root to Leaf Numbers
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
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;

        int res = helper(root, 0);

        return res;
    }
    
    public int helper(TreeNode node, int soFar) {
        if (node.left == null && node.right == null) {
            return 10 * soFar + node.val;
        }
 
        soFar = 10 * soFar + node.val;
        int res = 0;
        if (node.left != null)
            res += helper(node.left, soFar);
        if (node.right != null)
            res += helper(node.right, soFar);
        return res;
    }
}
```

### Test case:
```
[1,2,3,null,5,9,10]
```
```
[1,2,3]
```
```
[1,2,3,4,5,9,10]
```
```
[1]
```
```
[]
```
