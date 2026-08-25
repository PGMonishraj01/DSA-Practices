class Solution {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        int left = 1;
        int right = k + 1;
        int index = 0;
        while (left <= right) {
            if (index % 2 == 0) {
                arr[index] = left++;
            } else {
                arr[index] = right--;
            }
            index++;
        }
        for (int i = k + 2; i <= n; i++) {
            arr[index++] = i;
        }
        return arr;
    }
}