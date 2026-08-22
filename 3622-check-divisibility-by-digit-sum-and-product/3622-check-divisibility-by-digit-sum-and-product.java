class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int x = n;
        while(x != 0){
            int mod = x%10;
            x /= 10;
            sum += mod;
            mul *= mod;
        }
        return  n % (sum+mul) == 0? true: false;
    }
}