import java.util.*;
public class stackstart{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("first peek: " + stack.peek());
        System.out.println("frist pop: " + stack.pop());
        System.out.println("second peek: " +stack.peek());
        System.out.println("second pop :" +stack.pop());
        System.out.println("is empty: " + stack.isEmpty());
    }
}