package offer;

import java.util.Stack;

/**
 * Created by lh on 2022/9/8
 */
class MinStack {

    Stack<Integer> xStack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        xStack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
