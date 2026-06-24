import java.util.Stack;

public class queue_using_stack {
    lass MyQueue {
    Stack<Integer> s1; // input stack — push always goes here
    Stack<Integer> s2; // output stack — pop/peek read from here

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        transferIfNeeded();
        return s2.pop();
    }
    
    public int peek() {
        transferIfNeeded();
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    
    private void transferIfNeeded() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
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
}
