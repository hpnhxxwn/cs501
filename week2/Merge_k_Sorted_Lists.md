# Merge k Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
            
        return partition(lists, 0, lists.length - 1);
    }
    
    public ListNode partition(ListNode[] lists, int begin, int end) {
        if (begin == end) 
            return lists[begin];
            
        if (begin < end) {
            int p = begin + (end - begin) / 2;
        
            ListNode p1 = partition(lists, begin, p);
            ListNode p2 = partition(lists, p + 1, end);
            
            return merge(p1, p2);
        }
        else
            return null;
        
    }
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            }
            else {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            pre.next = l1;
        }
        if (l2 != null) {
            pre.next = l2;
        }
        return dummy.next;
    }
}
```

### Test case:
```
[[1,2,3],[1,2,4],[1,3,5]]
```
```
[[],[1,2,4],[1,3,5]]
```
```
[]
```
```
[[],[],[]]
```
```
[[1,2,4],[1,3,5]]
```
