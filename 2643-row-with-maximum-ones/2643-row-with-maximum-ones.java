class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        for(int i = 0; i < mat.length; i++){
            int oneCount = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    oneCount ++;
                }
            }
            if(oneCount > arr[1]){
                arr[0] = i;
                arr[1] = oneCount;
            }
        }
        return arr;
    }
}