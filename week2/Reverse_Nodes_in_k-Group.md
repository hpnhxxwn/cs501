# Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return head;
            
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;
        ListNode end = null;
        while (curr != null) {
            int i = 0;
            while(i < k && curr != null) {
                curr = curr.next;
                i++;
            }
            if (i < k)
                break;
            end = curr;

            pre = reverse(pre, end);
            
            curr = pre.next;
        }
        
        return dummy.next;
    }
    
    public ListNode reverse(ListNode begin, ListNode end) {
        ListNode curr = begin.next;
        ListNode dummy = curr;
        ListNode pre = begin;
        
        while (curr != end) {
            
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr; 
            curr = next;
        }
        ListNode tmp = begin.next;
        begin.next = pre;
        tmp.next = curr;
        return tmp;
    }
}
```

### Test case:
```
[]
1
```
```
[1]
1
```
```
[1]
3
```
```
[1,2,3,4,5,6]
4
```
```
[1,2,3,4,5,6,7,8,9,10,11]
3
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-13%20%E4%B8%8B%E5%8D%889.44.03.png?raw=true)
