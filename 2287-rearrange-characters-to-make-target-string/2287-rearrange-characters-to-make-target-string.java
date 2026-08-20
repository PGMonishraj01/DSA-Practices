class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freq = new int[26];
        int[] targetfreq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : target.toCharArray()){
            targetfreq[ch - 'a']++;
        }
        int min = 101;
        for(int i = 0; i < 26; i++){
            if(targetfreq[i] > 0)
            min = Math.min(min , freq[i] / targetfreq[i]);
        }
        return min;
    }
}