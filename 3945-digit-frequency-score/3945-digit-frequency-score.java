class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n != 0){
            int mod = n % 10;
            map.put(mod,map.getOrDefault(mod,0)+1);
            n /= 10;
        }
        int answer = 0;
        for(int i : map.keySet()){
            answer += (i*map.get(i));
        }
        return answer;
    }
}