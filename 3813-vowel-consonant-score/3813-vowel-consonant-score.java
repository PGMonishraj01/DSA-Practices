class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        String x = "aeiou";
        String y = "qwrtypsdfghjklmnbvcxz";
        for(int i = 0; i < s.length(); i++){
            if(x.contains(String.valueOf(s.charAt(i)))){
                v++;
            }
            else{
                if(y.contains(String.valueOf(s.charAt(i))))c++;
            }
        }
        if(c == 0)return 0;
        return v/c;
    }
}