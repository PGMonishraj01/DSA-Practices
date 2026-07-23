class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        String r = "";
        for(int i =0 ; i< str.length;i++){
            StringBuilder sb = new StringBuilder(str[i]);
            r+= sb.reverse()+" ";
        }
        return r.trim();
    }
}