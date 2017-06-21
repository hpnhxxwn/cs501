# N Queens II
### Solution code:
```
public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        
        if (n == 0)
            return res;
            
        helper(0, new int[n], new ArrayList<String>(), n, new int[2*n], new int[2*n], res);        
        return res;
    }
    
    public void helper(int row, int[] col, List<String> board, int n, int[] d1, int[] d2, List<List<String>> res) {
        if (row == n) {
            res.add(new ArrayList<String>(board));
        }
        for (int i = 0; i < n; i++) {
            if (col[i] != 1 && d1[row - i + n] != 1 && d2[row + i] != 1) {
                char[] r = new char[n];
                Arrays.fill(r, '.');
                r[i] = 'Q';
                col[i] = 1;
                d1[row - i + n] = 1;
                d2[row + i] = 1;
                board.add(new String(r));
                helper(row + 1, col, board, n, d1, d2, res);
                board.remove(board.size() - 1);
                col[i] = 0;
                d1[row - i + n] = 0;
                d2[row + i] = 0;
            }
        }
    }
}
```

### Test case:
```
0
```
```
1
```
```
4
```
```
2
```
```
5
```

![pic](https://github.com/hpnhxxwn/cs501/blob/master/week2/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202017-06-13%20%E4%B8%8B%E5%8D%889.51.56.png?raw=true)
