class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length-1, low = 0;
        int med = 0;
        while(low <= high){
             med = low + ((high-low)/2);
            if(nums[med] == target){
                return med;
            }else if(nums[med] < target){
                low = med + 1;
            }else{
                high = med - 1;
            }
        }
        return low;
    }
}