class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>(Arrays.stream(nums2).boxed().toList());
        List<Integer> l = new ArrayList<>();
        for(int i : nums1){
            if(list.contains(i)){
                list.remove(Integer.valueOf(i));
                l.add(i);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}