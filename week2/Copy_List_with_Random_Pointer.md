# Copy List with Random Pointer
### One pass using HashMap solution code:
```
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return head;
            
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode curr = dummy;
        while(head != null) {
            if (!map.containsKey(head)) {
                map.put(head, new RandomListNode(head.label));
            }
            curr.next = map.get(head);
            
            if (head.next != null) {
                if (!map.containsKey(head.next)) {
                    map.put(head.next, new RandomListNode(head.next.label));
                }
                curr.next.next = map.get(head.next);
            }
            
            
            if (head.random != null) {
                if (!map.containsKey(head.random)) {
                    map.put(head.random, new RandomListNode(head.random.label));
                }
                curr.next.random = map.get(head.random);
            }

            curr = curr.next;
            head = head.next;
        }
        
        return dummy.next;
    }
}
```

### Two pass Solution code:
```
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return head;
            
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        
        RandomListNode curr = head;
        
        while (curr != null) {
            map.put(curr, new RandomListNode(curr.label));
            curr = curr.next;
        }
        
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
```

### Without hash map:
```
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return head;
            
        RandomListNode curr = head;
        
        while (curr != null) {
            RandomListNode next = curr.next;
            curr.next = new RandomListNode(curr.label);
            curr.next.next = next;
            curr = next;
        }
        
        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        curr = head;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pointer = dummy;
        while (curr != null) {
            RandomListNode next = curr.next.next;
            
            pointer.next = curr.next;
            pointer = pointer.next;
            curr.next = next;
            curr = next;
            
            
        }
        return dummy.next;
    }
}
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-11%20%E4%B8%8B%E5%8D%885.36.44.png?raw=true)
