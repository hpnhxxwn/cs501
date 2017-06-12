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

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-10%20%E4%B8%8B%E5%8D%884.47.39.png?raw=true)
