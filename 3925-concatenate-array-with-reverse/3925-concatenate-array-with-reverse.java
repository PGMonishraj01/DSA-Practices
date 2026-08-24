class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        int k = arr.length-1;
        for(int i = 0;i < nums.length; i++){
            arr[i] = nums[i];
            arr[k--] = nums[i];
        }
        return arr;
    }
}