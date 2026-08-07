class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num == 0 )return true;
        for(int i = 0; i < num; i++){
            int rev = 0;
            int x = i;
            while(x != 0){
                int mod = x%10;
                rev = (rev*10) + mod;
                x /= 10;
            }
            if(i+rev == num)return true;
        }
        return false;
    }
}