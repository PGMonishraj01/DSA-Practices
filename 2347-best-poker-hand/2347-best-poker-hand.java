class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int freq[] = new int[14];
        int a[] = new int[26];
        for(int i : ranks)freq[i]++;
        for(char ch : suits)a[ch - 'a']++;
        for(int i : a){
            if(i == 5)return "Flush";
        }
        for(int i :freq){
            if(i >= 3)return "Three of a Kind";
        }
        for(int i : freq){
            if(i == 2)return "Pair";
        }
        
        return "High Card";
    }
}