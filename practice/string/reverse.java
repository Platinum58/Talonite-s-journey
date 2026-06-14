public class reverse{
    public static void main(String[] args){
        String name = "kartik";
        int n = name.length();
        String ne = "";
        for(int i = n - 1; i >= 0; i--){
           ne = ne + name.charAt(i);
        }
        if(name.equals(ne)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }    
    }
}