class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        int c = x;
        int temp = 0;
        while(c != 0){
            int a = c%10;
            temp = temp*10 + (a);
            c = c/10;
        }
        if(temp == x){
            return true;
        }else{
            return false;
        }
    }
}