# Serialize and Deserialize BST
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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return sb.toString();
        }
        
        sb.append(root.val);
        if (root.left != null)
            sb.append("," + serialize(root.left));
        if (root.right != null)
            sb.append("," + serialize(root.right));
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0)
            return null;
        String[] list = data.split(",");
        int[] idx = new int[1];
        idx[0] = 0;
        return helper(list, idx, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public TreeNode helper(String[] list, int[] pos, int min, int max) {
        if (pos[0] == list.length)
            return null;
        int val = Integer.parseInt(list[pos[0]]);
        if (val < min || val > max)
            return null;
        TreeNode curr = new TreeNode(val);
        pos[0]++;
        curr.left = helper(list, pos, min, val);
        curr.right = helper(list, pos, val, max);
        return curr;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
```

### Test case:
```
[2,1,3]
```
```
[3,1,5,0,null,null,6]
```
