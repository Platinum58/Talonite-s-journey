import java.util.Stack;

public class reverse_poilsh_notion {
    class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                
                    int m = s.pop();
                    int n = s.pop();
                    s.add(n+m);
                
            }else if(tokens[i].equals("-")){
                 
                    int m = s.pop();
                    int n = s.pop();
                    s.add(n-m);
                
            }else if(tokens[i].equals("*")){
               
                   int m = s.pop();
                    int n = s.pop();
                    s.add(n*m);
                
            }else if(tokens[i].equals("/")){
                
                    int m = s.pop();
                    int n = s.pop();
                    s.add(n/m);
                
            }else s.add(Integer.parseInt(tokens[i]));
            
        }
        return s.pop();
    }
}
}
