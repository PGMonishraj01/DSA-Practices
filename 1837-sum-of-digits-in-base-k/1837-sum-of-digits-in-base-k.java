class Solution {
    public int sumBase(int n, int k) {
    //    String ans = Integer.toString(n, k);
    //    int x = Integer.valueOf(ans);
       int sum = 0;
       while(n!=0){
        int r = n%k;
        sum += r;
        n/=k;
       }
       return sum;
    }
}