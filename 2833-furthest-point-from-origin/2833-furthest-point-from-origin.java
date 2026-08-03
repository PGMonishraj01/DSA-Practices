class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int L = moves.length()-moves.replaceAll("L","").length();
        System.out.println(L);
        int R = moves.length()-moves.replaceAll("R","").length();
        System.out.println(R);
                System.out.println(moves.length());

        return moves.length()-moves.replaceAll("_","").length()+Math.abs(L-R);
    }
}