# Plus One
### Sulution code:
```
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
          int[] result = new int[1];
          result[0] = 1;
          return result;
        }
        
        int carry = 1;
        int sum = 0;
        int[] result = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
          sum = carry +  digits[i];
          carry = (sum > 9) ? 1:0;
          
          sum = sum % 10;
          
          result[i + 1] = sum;
          
        }
        
        if (carry > 0) {
         result[0] = carry + sum; 
         return result;
        }

        int[] res = new int[digits.length];
        for (int i = 0; i < res.length; i++){
            res[i] = result[i+1];
        }
        return res;
    }
}
```

### Test case:
```
[]
[0]
[9]
[1,9]
[2,3,4]
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week1/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-04%20%E4%B8%8B%E5%8D%885.08.13.png?raw=true)
