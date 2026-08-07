class Solution {
    public int maxOperations(int[] nums) {
        int operations = 1;
        int score = nums[0]+nums[1];
        for(int i =2; i < nums.length - 1; i = i+2){
            if(nums[i] + nums[i+1] == score){
                operations++;
            }
            else{
                break;
            }
        }
        return operations;
    }
}