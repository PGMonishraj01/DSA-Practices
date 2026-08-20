class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a = (int)target;
        int min = 'z'+1;
        for(int i = 0; i < letters.length; i++){
            int b = (int)letters[i];
            if(b > a && b < min)min = b;
        }
        if(min != 'z'+1)return (char)min;
        return letters[0];
    }
}