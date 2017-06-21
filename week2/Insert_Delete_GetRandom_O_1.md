# Insert Delete GetRandom O(1)
### Solution code:
```
public class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        map.put(val, list.size());
        list.add(val);

        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int idx = map.get(val);

        if (idx < list.size() - 1) {

            map.put(list.get(list.size() - 1), idx);
            list.set(idx, list.get(list.size() - 1));
        }
        
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r = new Random();
        int n = list.size();
        int random = r.nextInt(n);
        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
```

### Test case:
```
["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
[[],[1],[2],[2],[],[1],[2],[]]
```
```
["RandomizedSet","insert","insert","remove","insert","getRandom","remove","insert","getRandom","remove","remove"]
[[],[1],[2],[-3],[2],[],[1],[2],[], [-3],[-3]]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-12%20%E4%B8%8B%E5%8D%889.36.51.png?raw=true)
