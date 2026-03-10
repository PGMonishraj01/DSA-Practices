class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int max=Arrays.stream(arr,i+1,arr.length).max().orElse(-1);
            arr[i]=max;
        }
        return arr;
    }
}
