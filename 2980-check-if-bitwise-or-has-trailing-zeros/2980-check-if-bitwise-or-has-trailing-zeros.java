class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i = 0; i <nums.length; i++){
            for(int j =i+1;j<nums.length;j++){
                String s = Integer.toBinaryString(nums[i] | nums[j]);
                if(s.charAt(s.length()-1) == '0')return true;
            }
        }
        return false;
    }
}