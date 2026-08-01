class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans  = 1;
        int zero = 0;
        int array[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                ans *= nums[i];
            }
        }
        if( zero > 1){
            return array;        
        }
        if( zero == 1 ){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    array[i] = ans;
                }
            }
            return array;
        }
        for(int i = 0; i <nums.length; i++){
            array[i] = ans/nums[i];
        }
        return array;
    }
}