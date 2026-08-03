class Solution {
    List<List<Integer>> list =  new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target , 0 , new ArrayList<>());
        return list;
    }
    public void backtrack(int[] nums , int target , int start , List<Integer> ans){
        if(target == 0){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i = start; i < nums.length; i++){
        if(i > start && nums[i] == nums[i-1])continue;
        if(nums[i] > target)break;
        ans.add(nums[i]);
        backtrack(nums  , target-nums[i] , i+1 , ans);
        ans.remove(ans.size()-1);
        }
    }
}