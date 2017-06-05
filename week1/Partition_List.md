# Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;
        
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = dummy2.next;
        
        return dummy1.next;
    }
}
```

### Test case:
```
[]
0
```
```
[1,4,3,2,5,2]
3
```
```
[1,4,3,2,5,2]
6
```
```
[1,4,3,2,5,2]
0
```
```
[1,4,0,0,2,0,2]
1
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week1/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-04%20%E4%B8%8B%E5%8D%889.25.22.png?raw=true)
