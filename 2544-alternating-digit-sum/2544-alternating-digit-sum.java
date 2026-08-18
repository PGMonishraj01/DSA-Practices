class Solution {
    public int alternateDigitSum(int n) {
        int x = 0;
        int y = 0;
        int count = 0;
        while (n != 0) {
            int mod = n % 10;
            if (count % 2 == 0) {
                x += mod;
            } else {
                y += mod;
            }
            n /= 10;
            count++;
        }
        if (count % 2 == 0) {
            return y - x;
        }
        return x - y;
    }
}