# Binary Search Tree Iterator
### Solution code:
```
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Stack<TreeNode> stack = null;

    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        addAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode min = stack.pop();
        addAll(min.right);
        
        return min.val;
    }
   
   public void addAll(TreeNode node) {
       while(node != null) {
           stack.push(node);
          
           node = node.left;
       }
   }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
```

### Test case:
```
[10,8,11,7,9]
[11,8,15,7,9,12]
[11,8,15,7,9,12, 17]
[]
[1]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week1/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-04%20%E4%B8%8B%E5%8D%884.43.25.png?raw=true)
