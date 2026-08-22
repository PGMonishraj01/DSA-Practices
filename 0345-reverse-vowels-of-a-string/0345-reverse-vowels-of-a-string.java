class Solution {
    public String reverseVowels(String s) {
        String x = "aeiouAEIOU";
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(x.contains(String.valueOf(c))){
                list.add(c);
            }
        }
         char[] arr = s.toCharArray();
        int n = list.size()-1;
        for(int i = 0; i < s.length(); i++){
            if(x.contains(String.valueOf(arr[i]))){
                arr[i] = list.get(n--);
            }
        }
        return new String(arr);
    }
}