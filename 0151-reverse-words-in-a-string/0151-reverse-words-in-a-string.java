class Solution {
    public String reverseWords(String s) {
        String array[] = s.split("\\s+");
        String str = "";
        for(int i = array.length-1; i >= 0; i--){
            str += array[i]+" ";
        }
        return str.trim();
    }
}