class Solution {
    Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return new ArrayList<>(ans);
    }
    public  void backtrack(int[] nums, int ind, List<Integer> list){
        if(list.size() > 1){
            ans.add(new ArrayList<>(list));
        }
        for(int i = ind; i < nums.length; i++){
            if(list.isEmpty() || list.get(list.size()-1) <= nums[i]){
            list.add(nums[i]);
            backtrack(nums, i+1, list);
            list.remove(list.size()-1);
        }
        }
    }
}