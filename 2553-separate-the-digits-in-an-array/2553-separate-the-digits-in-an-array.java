class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = nums.length-1 ; i>=0;i--){
            while(nums[i]!=0){
                int mod = nums[i]%10;
                l.add(mod);
                nums[i]/=10;
            }
        }
        int a[] = new int[l.size()];
        int k=0;
        for(int i= l.size()-1;i>=0;i--){
            a[k++]= l.get(i);
        }
        return a;
    }
}