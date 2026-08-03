class Solution {
    public int maxProduct(int n) {
        int length = Integer.toString(n).length();
        int arr[]= new int[length--];
        System.out.print(length);
        int ans = 0;
        while(n != 0){
            arr[length--]= n%10;
            n /= 10;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j <arr.length; j++){
                ans = Math.max(ans , arr[i]*arr[j]);
            }
        }
        return ans;
    }
}