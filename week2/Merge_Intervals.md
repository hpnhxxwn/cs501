# Merge Intervals
### Solution code:
```
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) 
            return intervals;
        
        List<Interval> result = new ArrayList<Interval>();
        int n = intervals.size();
        int start[] = new int[n];
        int end[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i = 0, j = 0; i < n; i++) {
            if (i == n - 1 || start[i + 1] > end[i]) {
                result.add(new Interval(start[j], end[i]));
                j = i + 1;
            }
        }
        
        return result;
    }
}
```

### Test case:
```
[[1,3],[2,6],[8,10],[15,18]]
```
```
[[1,3],[3,6],[8,10],[15,18]]
```
```
[[1,3],[4,6],[8,10],[15,18]]
```
```
[]
```
```
[[1,3],[2,6],[8,10],[9,18]]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-10%20%E4%B8%8B%E5%8D%8810.55.56.png?raw=true)
