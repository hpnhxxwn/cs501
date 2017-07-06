# Triangle
### 67.26% 
### Solution:
```
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1]; // level 1 has 1 node, level 2 has 2 nodes, and level n has n nodes
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
        /*
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        //System.out.println(m);
        //System.out.println(n);
        int[][] A = new int[m + 1][n + 1];
        for (int i = m - 1; i >= 0; i--) {
            
            for (int j = 0; j < triangle.get(i).size(); j++) {
                //System.out.println("interation");
                //System.out.println(i+1);
                //System.out.println(j+1);
                //System.out.println(A[i+1][j]);
                //System.out.println(A[i+1][j + 1]);
                //System.out.println(triangle.get(i).get(j));
                A[i][j] = Math.min(A[i + 1][j], A[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return A[0][0];*/
    }
}
```
