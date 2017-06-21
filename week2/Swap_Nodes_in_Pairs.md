# Swap Nodes in Pairs
### Solution code:
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        ListNode curr = head;
        
        while (curr != null && curr.next != null) {
            ListNode next = curr.next.next;

            pre.next = curr.next;

            curr.next.next = curr;
            curr.next = next;
            pre = curr;
            curr = next;
        }
        return dummy.next;
    }
}
```

### Test case:
```
[]
```
```
[1]
```
```
[1,2]
```
```
[1,2,3]
```
```
[1,2,3,4,5,6,7]
```
![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-13%20%E4%B8%8B%E5%8D%889.41.20.png?raw=true)
