class Solution {
    List<List<Integer>> list =  new ArrayList<>();
    public String getPermutation(int n, int k) {
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i+1;
        }
        boolean[] bool = new boolean[nums.length];
        backtrack(nums, bool , new ArrayList<>());
        String s = "";
        for(int i : list.get(k-1)){
            s += i+"";
        }
        return s;
    }
    public void backtrack(int[] nums, boolean[] bool, List<Integer> ans){
        if(ans.size()==nums.length){
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
