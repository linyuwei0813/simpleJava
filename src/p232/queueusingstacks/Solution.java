package p232.queueusingstacks;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;


    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (!outStack.isEmpty()) {
            return outStack.pop();
        } else if (!inStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                int x = inStack.pop();
                outStack.push(x);
            }
            return outStack.pop();
        }
        return -1;
    }

    public int peek() {
        if (!outStack.isEmpty()) {
            return outStack.peek();
        } else if (!inStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                int x = inStack.pop();
                outStack.push(x);
            }
            return outStack.peek();
        }
        return -1;

    }

    public boolean empty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
