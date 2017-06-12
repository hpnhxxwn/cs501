# Valid Parentheses
### Solution code:
```
public class Solution {
    public boolean isValid(String s) {
        if (s == "")
            return true;
        
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ')' || c[i] == '}' || c[i] == ']') {
                if (stack.isEmpty())
                    return false;
                char tmp = stack.pop();
                if ((c[i] == ')' && tmp != '(') || (c[i] == '}' && tmp != '{') || (c[i] == ']' && tmp != '['))
                    return false;
            }
            else {
                stack.push(c[i]);
            }
        }
        return stack.isEmpty();
    }
}
```

### Test code:
```
"["
```
```
"[]"
```
```
""
```
```
()[]{}
```
```
([)]
```
