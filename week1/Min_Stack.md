# Min Stack
### Solution code:
```
public class MinStack {
    ArrayDeque<Integer> stack;
    ArrayDeque<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayDeque<Integer>();
        minStack = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        int x = stack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```

### Test case:
```
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
```
```
["MinStack","push","push","push","getMin","top","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
```
```
["MinStack","push","push","push","pop","pop","getMin","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[], []]
```
```
["MinStack","push","push","push","pop","pop","pop", "getMin","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[],[], []]
```
```
["MinStack","push","push","push","pop","getMin", "pop", "getMin","getMin","top"]
[[],[-2],[0],[-3],[],[],[],[],[],[]]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week1/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-04%20%E4%B8%8B%E5%8D%888.52.07.png?raw=true)
