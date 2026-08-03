class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int min = 0;
        int i = 0;
        int rev = startIndex;
        int x =  startIndex;
        while( i < words.length){
            if(x == words.length)x = 0;
            if(rev <0)rev= words.length-1;
            if(words[x].equals(target) || words[rev].equals(target))break;
            x++;
            min++;
            i++;
            rev--;
        }
         return min == words.length? -1 : min;
    }
}