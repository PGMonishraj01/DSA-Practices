class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size())return false;
        for(int i =0;i<s.length();i++){
            
                String a = words.get(i);
                if(s.charAt(i)!=a.charAt(0))return false;
            }
        
        return true;
    }
}