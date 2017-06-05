# Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
            
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}
```

### Test case:
```
[]
[4,2,7,1,3,6,9]
[4,2,7,null,3,6,9]
[4,2,7,6,null,6,9]
[4,7,2,9,6,null,6]
[4,7,2,9,6,5,null]
[4,7,null,5]
```
![pic](https://github.com/hpnhxxwn/cs501/blob/master/week1/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-04%20%E4%B8%8B%E5%8D%884.50.17.png?raw=true)
