# Insert Interval
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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();
        
        if (intervals == null || intervals.size() == 0) {
            result.add(newInterval);
            return result;
        }
        
        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i++));
        }
        
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        while (i< intervals.size() && intervals.get(i).start <= newInterval.end) {
            start = Math.min(start, Math.min(newInterval.start, intervals.get(i).start));
            end = Math.max(end, Math.max(newInterval.end, intervals.get(i).end));
            i++;
            
        }
        start = Math.min(start, newInterval.start);
        end = Math.max(end, newInterval.end);
        result.add(new Interval(start, end));
        while (i < intervals.size()) {
            result.add(intervals.get(i++));
        }
        return result;
    }
```

### Test case:
```
[[1,3],[6,9]]
[2,5]
```
```
[[1,3],[6,9]]
[0,1]
```
```
[[2,3],[6,9]]
[0,1]
```
```
[[1,3],[6,9]]
[10,11]
```
```
[[1,3],[6,9]]
[4,7]
```
![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-13%20%E4%B8%8B%E5%8D%889.39.33.png?raw=true)
