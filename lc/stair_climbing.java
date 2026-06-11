class Solution {
    public int climbStairs(int n) {
        if(n <= 1){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}//couldn't submit cause time exceeded but will learn optimal solution later//