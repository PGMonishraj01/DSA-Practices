class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[1001];
        for(int i = 0; i < n; i++){
            for(int j =0; j < nums[i].length; j++){
                freq[nums[i][j]]++;
            }
        }
        for(int i = 0; i < 1001; i++){
            if(freq[i] == n){
                list.add(i);
            }
        }
        return list;
    }
}