class Solution {
    static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public int minimumRightShifts(List<Integer> nums) {
  
        int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int count = 0;
        int n = arr.length;
        int k = 1;
        for(int i = 0; i < n; i++){
            if(Arrays.equals(copy, arr))return count;
            count++;
            reverse(arr, 0, n-1);
            reverse(arr, 0, k-1);
            reverse(arr, k ,n-1);
            if(Arrays.equals(copy, arr))return count;
        }
        return -1;
    }
}