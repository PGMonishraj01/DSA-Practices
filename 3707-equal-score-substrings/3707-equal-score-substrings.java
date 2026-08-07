class Solution {
    public boolean scoreBalance(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            total += s.charAt(i) - 'a' + 1;
        }
        int left = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int val = s.charAt(i) - 'a' + 1;
            left += val;
            total -= val;
            if (left == total)
                return true;
        }
        return false;
    }
}