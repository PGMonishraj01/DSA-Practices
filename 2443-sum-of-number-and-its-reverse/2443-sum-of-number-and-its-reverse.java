class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0; i < (Math.pow(10,5)); i++){
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