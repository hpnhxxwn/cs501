/**
 * Created by hpnhxxwn on 2017/6/13.
 */
import java.util.*;

public class StackSort {

    public static void sort(Deque<Integer> stack) {
        Deque<Integer> tmp = new ArrayDeque<Integer>();

        while (!stack.isEmpty()) {
            if (tmp.isEmpty()) {
                tmp.push(stack.pop());
            }
            else if (!stack.isEmpty()) {
                int p = stack.pop();
                while (!tmp.isEmpty() && p > tmp.peek()) {
                    stack.push(tmp.pop());
                }
                tmp.push(p);
            }
        }
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(6);
        stack.push(1);
        stack.push(5);
        stack.push(10);
        sort(stack);
        for (int i: stack) {
            System.out.println(i);
        }

    }
}
