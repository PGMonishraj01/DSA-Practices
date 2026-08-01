class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    String min = "";
                    if(j<10)min ="0"+ j;
                    else min = j+"";
                    list.add(i + ":" + min);
                }
            }
        }
        return list;
    }
}