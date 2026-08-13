class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(char c : word.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for(char i = 'a'; i <= 'z'; i++){
            if(set.contains(i) && set.contains(Character.toUpperCase(i)))count++;
        }
        return count;
    }
}