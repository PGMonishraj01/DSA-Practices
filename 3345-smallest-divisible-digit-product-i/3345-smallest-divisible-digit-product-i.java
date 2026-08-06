class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i <=100; i++){
            int ans = 1;
            int x = i;
            while(x != 0){
                ans *= x%10;
                x /= 10;
            }
            if(ans % t == 0){
                return i;
            }
        }
        return n;
    }
}