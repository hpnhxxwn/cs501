# Ransom Note
### Solution code:
```
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == "")
            return true;
        if (magazine == "")
            return false;
            
        int[] map = new int[26];
        char[] c = magazine.toCharArray();
        for (int i = 0; i < c.length; i++) {
            map[c[i] - 'a']++;
        }
        
        char[] r = ransomNote.toCharArray();
        for (int i = 0; i < r.length; i++) {
            if (map[r[i] - 'a'] <= 0)
                return false;
            map[r[i] - 'a']--;
        }
        
        return true;
    }
}
```

### Test case:
```
"a"
"b"
```
```
"a"
"ab"
```
```
"aa"
"aab"
```
```
""
"aab"
```
```
"aab"
""
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-10%20%E4%B8%8B%E5%8D%885.23.20.png?raw=true)
