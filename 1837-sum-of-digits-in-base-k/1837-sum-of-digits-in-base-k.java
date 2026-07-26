class Solution {
    public int sumBase(int n, int k) {
       String ans = Integer.toString(n, k);
       int x = Integer.valueOf(ans);
       int sum = 0;
       while(x!=0){
        int r = x%10;
        sum += r;
        x/=10;
       }
       return sum;
    }
}