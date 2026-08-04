class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int k = 0; k < 4; k++){
            boolean flag = true;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(mat[i][j] != target[i][j]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)return true;
            int arr[][] = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[j][n-1-i] = mat[i][j];
                }
            }
            mat = arr;
        }
        return false;
    }
}