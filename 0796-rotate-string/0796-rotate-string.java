class Solution {
    public static char[] reverse(char ch[], int start ,int end){
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return ch;
    }
    public boolean rotateString(String s, String goal) {
        char ch[] = s.toCharArray();
        int n = s.length();
        for(int i = 0; i < n; i++){
            int  k = 1;
            k = k%n;
            reverse(ch,0,k-1);
            reverse(ch,k,n-1);
            reverse(ch,0,n-1);
            s = new String(ch);
            if(s.equals(goal))return true;
        }
        return false;
    }
}