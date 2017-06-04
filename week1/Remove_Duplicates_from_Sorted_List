# Remove Duplicates from Sorted List
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
        if (head == null) {
            return head;
        }
        
        ListNode list = head;
        
        while (list != null) {
            if (list.next != null && list.next.val == list.val) {
                list.next = list.next.next;
            }
            else
                list = list.next;
        }
        return head;
    }
}
```

### Test case:
`
[]
[1,1,2]
[1,1,2,3,3]
[0,1,1,2,3,3,4,5,6,6,7]
[0]
```
