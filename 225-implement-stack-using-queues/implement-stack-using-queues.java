import java.util.*;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);

        // Move all elements from q1 to q2
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the element on top of the stack.
    public int pop() {
        if (q1.isEmpty()) return -1;
        return q1.remove();
    }

    // Get the top element.
    public int top() {
        if (q1.isEmpty()) return -1;
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
