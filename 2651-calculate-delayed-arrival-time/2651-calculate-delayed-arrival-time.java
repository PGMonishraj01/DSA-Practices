class Solution {
    public int findDelayedArrivalTime(int a, int b) {
        int sum = a+b;
        if(sum >= 24){
            sum %=24;
        }
        return sum;
    }
}