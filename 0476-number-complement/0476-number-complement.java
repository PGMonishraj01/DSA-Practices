class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String x = "";
        for(char i : s.toCharArray()){
            if(i == '0'){
                x += '1';
            }
            else{
                x += '0';
            }
        }
        return Integer.parseInt(x, 2);
    }
}