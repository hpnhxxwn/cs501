# Remove Duplicates from Sorted List II 
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.next.val == curr.val) {
                curr = curr.next;
            }
            if (curr != pre.next) {
                pre.next = curr.next;
            } 
            else {
                pre = pre.next;
            }
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
```

### Test case:
```
[]
[1,2,3,3,4,4,5]
[1,1,2,3,3,4,4,5,5]
[1]
[1,2,3,3,3,3,3,3,4]
```
