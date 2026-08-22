class Solution {
    public boolean isValid(String word) {
        String a = "aeiouAEIOU";
        int c = 0;
        int vowel = 0;
        int consonant = 0;
        for (char ch : word.toCharArray()) {
            if(!Character.isLetterOrDigit(ch)) {
                return false;
            }
            c++;
            if(a.indexOf(ch) != -1) {
                vowel++;
            }
            else if(Character.isLetter(ch)) {
                consonant++;
            }
        }
        if (c < 3) return false;
        if (vowel == 0 || consonant == 0) return false;
        return true;
    }
}