/**
 * Created by hpnhxxwn on 2017/6/13.
 */

import java.util.*;

public class Merge_K_Sorted_Arrays {
    public static List<Integer> merge(int[][] arrays,int k) {
        List<Integer> res = new ArrayList<Integer>();
        return partition(arrays, 0, k-1);
    }

    public static List<Integer> partition(int[][] arrays, int i, int j) {
        List<Integer> res = new ArrayList<Integer>();
        if (i > j)
            return res;
        if (i == j) {
            for (int a = 0; a < arrays[i].length; a++) {
                res.add(arrays[i][a]);
            }
            //res.addAll(Arrays.asList(arrays[i]));
            return res;
        }
            //return Arrays.asList(arrays[i]);

        int mid = i + (j - i) / 2;
        List<Integer> l1 = partition(arrays, i, mid);
        List<Integer> l2 = partition(arrays, mid + 1, j);
        return merge2(l1, l2);

    }

    public static List<Integer> merge2(List<Integer> l1, List<Integer> l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        int i, j;

        List<Integer> res = new ArrayList<Integer>();
        for (i = 0, j = 0; i < l1.size() && j < l2.size();) {
            if (l1.get(i) <= l2.get(j)) {
                res.add(l1.get(i));
                i++;
            }
            else {
                res.add(l2.get(j));
                j++;
            }
            //System.out.println(res.get(res.size() - 1));
        }

        if (i < l1.size()) {
            res.addAll(res.size(), l1.subList(i, l1.size()));
        }
        if (j < l2.size()) {
            res.addAll(res.size(), l2.subList(j, l2.size()));
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] test = new int[5][];
        test[0] = new int[] {1,2,3,4};
        test[1] = new int[] {1,4,5};
        test[2] = new int[] {10};
        test[3] = new int[] {};
        test[4] = new int[] {5,9,10,20,30,35};
        List<Integer> res = merge(test, 5);

        for (int i: res) {
            System.out.println(i);
        }

    }
}
