# Serialize and Deserialize Binary Tree
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
        if (root == null)
            return "#";
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("," + serialize(root.left));
        sb.append("," + serialize(root.right));

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] list = data.split(",");
        int[] pos = new int[1];
        pos[0] = 0;
        return helper(list, pos);
    }
    
    public TreeNode helper(String[] list, int[] pos) {
        if (list[pos[0]].equals("#")) {
            pos[0]++;
            return null;
        }
            
        int val = Integer.parseInt(list[pos[0]]);
        TreeNode node = new TreeNode(val);
        pos[0]++;
        node.left = helper(list, pos);
        node.right = helper(list, pos);
        
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
```

### Test case:
```
[]
```
```
[1,2,3]
```
```
[1,2,null,3,4,null,5]
```
