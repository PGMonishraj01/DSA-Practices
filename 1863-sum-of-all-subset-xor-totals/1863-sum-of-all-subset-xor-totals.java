class Solution {
    int sum=0;
    public int subsetXORSum(int[] nums) {
        xcall(nums,0,0);
        return sum;
    }
    public void xcall(int[] nums , int start , int xsum){
        if(start == nums.length){
            sum += xsum;
            return ;
        }
        xcall(nums,start+1 , xsum^nums[start]);
        xcall(nums,start+1 , xsum); 
    }
}