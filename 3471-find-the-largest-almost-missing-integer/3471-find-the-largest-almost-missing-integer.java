class Solution {
    public int largestInteger(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0; i <= nums.length-k; i++){
            List<Integer> list1 = new ArrayList<>();
            for(int j = i; j < i+k; j++){
                list1.add(nums[j]);
            }
            list.add(list1);
        }
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < list.size();j++){
                if(list.get(j).contains(nums[i])){
                    count++;
                }
            }
            if(count == 1){
                max = Math.max(max,nums[i]);
            }
        }
        return max;
    }
}