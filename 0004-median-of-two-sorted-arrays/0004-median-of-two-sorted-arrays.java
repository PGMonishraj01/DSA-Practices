class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length+nums2.length];
        int ind=0;
        int mid=0;
        for(int i=0;i<nums1.length;i++){
            res[ind]=nums1[i];
            ind++;
        }
        for(int j=0;j<nums2.length;j++){
            res[ind]=nums2[j];
            ind ++;
        }
        Arrays.sort(res);
        mid=res.length/2;
        if(res.length%2==0)return (res[mid]+res[mid-1])/2.0;
        else return res[mid];
    }
}