class Solution {
    public int accountBalanceAfterPurchase(int x) {
        int n = x%10;
        int y;
        if(n < 5){
            y = x-n;
        }
        else{
            y = x + (10 - n);
        }
        return 100 - y;
    }
}