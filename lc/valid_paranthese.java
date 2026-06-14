class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> list = new HashMap<>();
        list.put(')','(');
        list.put('}','{');
        list.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i <= s.length() - 1; i++){
            char c = s.charAt(i);
            if(list.containsValue(c)){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                if(list.get(c) != stack.pop()){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}