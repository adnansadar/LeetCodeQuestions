import java.util.*;
class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    /** Push element x onto stack. */
    public void push(int x) {
        while (q1.size() != 0) {
            int temp = q1.remove();
            q2.add(temp);
        }
        q1.add(x);
        while (q2.size() != 0) {
            int temp2 = q2.remove();
            q1.add(temp2);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.remove();
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj =
 * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */