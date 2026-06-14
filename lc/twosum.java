class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> em = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
           if(em.containsKey(target - nums[i])){
            return new int[]{i,em.get(target-nums[i])};
           }else{
            em.put(nums[i],i);
           }
        } return new int[]{};
    }
}