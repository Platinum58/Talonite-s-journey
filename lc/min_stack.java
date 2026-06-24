import java.util.Stack;

public class min_stack {
    class MinStack {
    
    Stack <Integer> st = new Stack<>();
    Stack<Integer> a = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        
        a.push(value);
        if(st.isEmpty() || value <= st.peek()) st.push(value);
        
    }
    
    public void pop() {
       if(a.peek().equals(st.peek())) st.pop();
       a.pop();
    }
    
    public int top() {
        return a.peek();
    }
    
    public int getMin() {
        return st.isEmpty() ? -1 : st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
