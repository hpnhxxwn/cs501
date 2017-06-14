# Fraction to Recurring Decimal
### Solution code:
```
public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (numerator < 0 ^ denominator < 0) {
            sb.append("-");
        }
        
        
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        sb.append(num / den);
        num = num % den;

        if (num == 0)
            return sb.toString();
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        
        sb.append(".");
        map.put(num, sb.length());

        while (num != 0) {
            num = num * 10;
            sb.append(num / den);
            num = num % den;
            if (map.containsKey(num)) {
                int idx = map.get(num);
                sb.insert(idx, "(");
                sb.append(")");
                return sb.toString();
            }
            map.put(num, sb.length());
        }
        
        return sb.toString();
    }
}
```

### Test case:
```
1
5
```
```
1
3
```
```
10
3
```
```
0
3
```
```
1
2147483647
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-12%20%E4%B8%8B%E5%8D%8810.51.17.png?raw=true)
