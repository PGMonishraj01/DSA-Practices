class Solution {
    public String findValidPair(String s) {
        int freq[] = new int[10];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - '0']++;
        }
        for(int i = 0; i < s.length()-1; i++){
            int x = s.charAt(i) - '0';
            int y = s.charAt(i+1) - '0';
           
           if(x != y && freq[x]==x && freq[y]==y){
                return ""+x+y;  
           }
        }
        return "";
    }
}