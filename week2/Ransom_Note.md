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
