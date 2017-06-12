# Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }
            else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
            
        }
        
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        
        return dummy.next;
    }
}
```

### Test case:
`
[]
[]
```
```
[]
[1,2,3,4,5]
```
```
[1,2,3,4,5]
[]
```
```
[1,2,3,4,5]
[1,2,3,4,5]
```
```
[1,3,5,6,7]
[1,2,4,8]
```
