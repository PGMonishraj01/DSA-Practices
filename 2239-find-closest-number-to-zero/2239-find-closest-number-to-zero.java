class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2 )return nums[0];
        int ind = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0)ind = i;
        }
        if(nums.length-1 == ind)return nums[ind];
        if(Math.abs(nums[ind]) < nums[ind+1])return nums[ind];
        return nums[ind+1];
    }
}