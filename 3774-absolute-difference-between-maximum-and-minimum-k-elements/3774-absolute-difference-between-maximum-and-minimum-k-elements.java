class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        for(int i = nums.length-1; i >nums.length-1-k; i--){
            sum2 += nums[i];
            System.out.print(nums[i]+" ");
        }
        return Math.abs(sum - sum2);
        
    }
}