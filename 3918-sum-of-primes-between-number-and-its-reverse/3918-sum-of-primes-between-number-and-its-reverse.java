class Solution {
    public int sumOfPrimesInRange(int n) {
        int x = 0;
        int k = n;
        while(k != 0){
            x = (x * 10)+(k % 10);
            k /= 10;
        }
        if(x < n){
            int temp = n;
            n =x;
            x = temp;
        }
        int ans = 0;
        for(int i = n; i <= x; i++){
            
            if(i > 1){
                if(isPrime(i))ans += i;
            }
        }
        return ans;
    }
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)count ++;
        }
        return count==0 ? true : false;
    }
}