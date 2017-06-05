# Top K Frequent Elements 
### Solution code:
```
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for (int key: map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<Integer>();
            }
            List<Integer> tmp = bucket[freq];
            tmp.add(key);
            bucket[freq] = tmp;
        }
        
        List<Integer> result = new ArrayList<Integer>(k);
        
        for (int i = bucket.length - 1; i > 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                List<Integer> tmp = bucket[i];
                for (int j = 0; j < tmp.size() && result.size() < k; j++) {
                    result.add(tmp.get(j));
                }
            }
        }
        
        return result;
    }
}
```

### Test cases:
```
[1,1,1,2,2,3,3,3,3,4,4,4,4]
2
```
```
[1,1,1,2,2,3,3,3,3,4,4,4,4]
3
```
```
[2,1,3,2,1,3,4,3,2,1,3,13,2,3,4,4,4,4]
5
```
```
[]
```
```
[2,1,0,-1,0,1,2]
2
```
![pic](https://github.com/hpnhxxwn/cs501/blob/master/week1/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-04%20%E4%B8%8B%E5%8D%884.48.44.png?raw=true)
