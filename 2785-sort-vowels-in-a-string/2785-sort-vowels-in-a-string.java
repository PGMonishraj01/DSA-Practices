class Solution {
    public String sortVowels(String s) {
        
        String x = "AEIOUaeiou";
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< s.length();i++){
            if(x.contains(String.valueOf(s.charAt(i))))
            list.add((int)s.charAt(i));
        }
        Collections.sort(list);
        int k = 0;
        char[] c = s.toCharArray(); 
        for(int i = 0; i< s.length();i++){
            if(x.contains(String.valueOf(s.charAt(i)))){
                c[i] = (char) list.get(k).intValue();
                k++;
            }
        }
        return new String(c);
    }
}