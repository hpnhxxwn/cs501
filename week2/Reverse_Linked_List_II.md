# Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode nNode = head;
        ListNode mNode = head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
            head = head.next;
        }
        int delta = n-m;
        for (int i = 0; i < delta; i++) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
            
        }
        
        return dummy.next;
    }
}
```

### Test case:
```
[5]
1
1
```
```
[1,2,3,4,5]
2
4
```
```
[1,2,3,4,5]
0
0
```
```
[1,2,3,4,5]
2
2
```
```
[1,2,3,4,5]
1
5
```
