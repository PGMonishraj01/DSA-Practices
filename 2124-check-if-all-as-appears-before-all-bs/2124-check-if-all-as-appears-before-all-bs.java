class Solution {
    public boolean checkString(String s) {
        int x = s.indexOf('b');
        if(x==-1)return true;
        int c =0;
        for(int i = x;i<s.length();i++){
            if(s.charAt(i)=='b')c++;
        }
        return s.length()-x == c;
    }
}