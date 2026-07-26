class Solution {
    public String replaceDigits(String s) {

        char[] c = s.toCharArray();

        for (int i = 1; i < c.length; i += 2) {

            int digit = c[i] - '0';

            c[i] = (char)(c[i - 1] + digit);
        }

        return new String(c);
    }
}