class Solution {
    public int minBitFlips(int start, int goal) {
        String x = "";
        String y = "";
        while(start >0 || goal > 0){
            x += start%2+"";
            y += goal%2+"";
            start/=2;
            goal/=2;
        }
        int count = 0;
        for(int i = x.length()-1; i>=0;i--) {
            if(x.charAt(i)!=y.charAt(i))count++;
        }
        return count;
    }
}