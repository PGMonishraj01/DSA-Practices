class Solution {
    public static void reverse(int[] nums , int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
    public boolean check(int[] nums) {
        int arr[] = Arrays.copyOf(nums , nums.length);
        Arrays.sort(arr);
        int k = 1;
        for(int i = 0; i < nums.length; i++){
            reverse(nums , 0 , k-1);
            reverse(nums , k , nums.length-1);
            reverse(nums , 0 , nums.length-1);
            if(Arrays.equals(nums , arr))return true;
        }
        return false;
    }
}