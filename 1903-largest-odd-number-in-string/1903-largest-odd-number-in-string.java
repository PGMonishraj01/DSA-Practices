class Solution {
    public String largestOddNumber(String nums) {
        int c = 0;
        for(int i = nums.length()-1; i >=0; i--){
            if(Integer.valueOf(nums.charAt(i)) % 2 == 1){
                return nums.substring(0 , nums.length()-c);
            }
            c++;
        }
        return "";
    }
}