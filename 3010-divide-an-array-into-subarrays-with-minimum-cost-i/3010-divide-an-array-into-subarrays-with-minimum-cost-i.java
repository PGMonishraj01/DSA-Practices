class Solution {
    public int minimumCost(int[] nums) {
        int n = nums[0];
        Arrays.sort(nums);
        if(nums[0]==n || nums[1]==n||nums[2]==n)return nums[0]+nums[1]+nums[2];
        return nums[0]+nums[1]+n;
    }
}