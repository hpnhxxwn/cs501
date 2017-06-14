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
