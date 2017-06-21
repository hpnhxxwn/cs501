# Strobogrammatic Number
### Solution code:
```
public class Solution {
    public boolean isStrobogrammatic(String num) {
        int p1 = 0;
        int p2 = num.length() - 1;
        char[] c = num.toCharArray();
        while (p1 <= p2) {
            if (c[p1] != '6' && c[p1] != '9' && c[p1] != '8' && c[p1] != '1' && c[p1] != '0' ||
                c[p2] != '6' && c[p2] != '9' && c[p2] != '8' && c[p2] != '1' && c[p2] != '0')
                return false;
                
            if (c[p1] == '6' && c[p2] != '9' ||
                c[p1] == '9' && c[p2] != '6' ||
                c[p1] == '8' && c[p2] != '8' ||
                c[p1] == '1' && c[p2] != '1' ||
                c[p1] == '0' && c[p2] != '0' ||
                
                c[p2] == '6' && c[p1] != '9' ||
                c[p2] == '9' && c[p1] != '6' ||
                c[p2] == '8' && c[p1] != '8' ||
                c[p2] == '1' && c[p1] != '1' ||
                c[p2] == '0' && c[p1] != '0' )
                return false;
            p1++;
            p2--;
        }

        return true;
    }
}
```

### Test case:
```
"1"
```
```
"6889"
```
```
"188881"
```
```
"1800081"
```
```
"6699"
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-12%20%E4%B8%8B%E5%8D%888.16.08.png?raw=true)
