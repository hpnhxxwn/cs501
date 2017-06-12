# Group Anagrams
### Solution code:
```
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        
        if (strs == null || strs.length == 0)
            return result;
            
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String postProcessed = String.valueOf(c);
            if (!map.containsKey(postProcessed)) {
                map.put(postProcessed, new ArrayList<String>());
            }
            map.get(postProcessed).add(strs[i]);
        }
        
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            List<String> tmp = new ArrayList<String>();
            tmp.addAll(entry.getValue());
            result.add(tmp);
        }
        
        return result;
    }
}
```

### Test case:
```
["eat","tea","tan","ate","nat","bat"]
```
```
[]
```
```
["eat","nat","bat"]
```
```
["eat"]
```
```
[""]
```
