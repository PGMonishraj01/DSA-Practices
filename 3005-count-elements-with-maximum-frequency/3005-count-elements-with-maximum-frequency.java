class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int[101];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        int max = Arrays.stream(freq).max().getAsInt();        
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(freq[nums[i]]==max)count++;
        }
        return count;
    }
}