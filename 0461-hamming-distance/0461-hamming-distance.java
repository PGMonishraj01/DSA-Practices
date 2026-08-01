class Solution {
    public int hammingDistance(int x, int y) {
        String s = "";
        String c = "";
        while(x != 0 || y != 0){
            s += x % 2+"";
            x /= 2;
            c += y % 2+"";
            y /= 2;
        }
        s = new StringBuilder(s).reverse().toString();
        c = new StringBuilder(c).reverse().toString();
        int count = 0;
        for(int i =0 ;i < s.length(); i++){
            if(s.charAt(i)!=c.charAt(i))count++;
        }
        return count;
    }
}