# Reverse Words in a String II
### Solution code:
```
public class Solution {
    public void reverseWords(char[] s) {
        int p1 = 0;
        int head = 0;
        reverse(s, p1, s.length - 1);
        
        for (p1 = 0; p1 < s.length; p1++) {
            if (s[p1] == ' '){
                reverse(s, head, p1-1);
                head = p1 + 1;
            }
        }
        
        reverse(s, head, p1 - 1);
    }
    
    public void reverse(char[] s, int p1, int p2) {
        while(p1 < p2) {
            char tmp = s[p1];
            s[p1] = s[p2];
            s[p2] = tmp;
            p1++;
            p2--;
        }
    }
    
}
```

### Test case:
```
"the sky is blue"
```
```
"hi!"
```
```
"wonderful"
```
```
"I want to transit to CS"
```
```
"I don't want to stay at the current company!!"
```
