class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> list = Arrays.stream(nums).boxed().toList();;
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            if(!list.contains(i*k))return i*k;
        }
        return 0;
    }
}