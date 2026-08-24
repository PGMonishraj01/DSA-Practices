class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > 1) {
                if (!list.contains(nums[i])) {
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}