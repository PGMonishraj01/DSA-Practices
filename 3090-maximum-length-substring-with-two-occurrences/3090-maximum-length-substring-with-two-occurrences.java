class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0;
        int ans = 0;
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            freq[index]++;
            while(freq[index] > 2){
                int lindex = s.charAt(l) - 'a';
                freq[lindex]--;
                l++;
            }
            ans = Math.max(ans, i-l+1);
        }
        return ans;
    }
}

