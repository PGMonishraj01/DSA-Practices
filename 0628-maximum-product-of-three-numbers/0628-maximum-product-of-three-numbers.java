class Solution {
    public int maximumProduct(int[] a) {
        Arrays.sort(a);
        int mul = 1 ;int k = 1;
        int n = a.length;
        k = a[n-1]*a[n-2]*a[n-3];
        mul=a[0]*a[1]*a[n-1];
        return Math.max(mul,k);
    }
}