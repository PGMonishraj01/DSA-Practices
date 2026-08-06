class Solution {
    public int maxDifference(String s) {
        int freq[] = new int[100];
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
            set.add(s.charAt(i));
        }
        
        int min = 100;
        int max = 0;
        for(char ch : set){
            if(freq[ch-'a'] % 2 == 0 && freq[ch-'a'] < min){
                min = freq[ch-'a'];
            }
            else{
                if(freq[ch-'a'] > max && freq[ch-'a']%2 == 1)max =freq[ch-'a'];
            }
        }
        return (max - min);
    }
}