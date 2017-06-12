# Reorder List
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
    public void reorderList(ListNode head) {
        if (head == null)
            return;
            
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reversed = reverse(slow.next);

        slow.next = null;
        
        while(head != null && reversed != null) {
            ListNode next = head.next;
            head.next = reversed;
            reversed = reversed.next;
            head.next.next = next;
            head = next;
        }
    }
    
    public ListNode reverse(ListNode head) {
        if (head == null)
            return head;
        
        ListNode pre = null;
        ListNode curr = head;
        
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        
        return pre;
    }
}
```

### Test case:
```
[]
```
```
[1,2,3,4]
```
```
[1,2,3,4,5]
```
```
[1,2,3,4,5,6]
```
```
[1,2,3,4,5,6,7]
```
