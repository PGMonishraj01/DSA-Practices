class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Long> l= new ArrayList<>();
        long sum = 0;
        while(n != 0){
            long  mod = n%10;
            sum+= mod;
            if(mod > 0)l.add(mod);
            n/=10;
        }
        long x = 0;
        for(int i =l.size()-1;i >= 0 ; i--){
            x = (x*10)+l.get(i);
        }
        return x*sum;
    }
}