class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] bool = new boolean[nums.length];
        backtrack(nums, bool , new ArrayList<>());
        return list;
    }
    public void backtrack(int[] nums, boolean[] bool, List<Integer> ans){
        if(ans.size()==nums.length){
            if(!list.contains(ans))
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(bool[i]){
                continue;
            }
            bool[i]= true;
            ans.add(nums[i]);
            backtrack(nums,bool,ans);
            ans.remove(ans.size() - 1);
            bool[i] = false;
        }
    }
}