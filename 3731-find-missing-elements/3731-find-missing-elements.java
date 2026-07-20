class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            while (nums[i] + 1 < nums[i + 1]) {
                list.add(nums[i] + 1);
                nums[i]++;
            }
        }
        return list;
    }
}