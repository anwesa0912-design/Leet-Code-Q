class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l=Math.min(nums1.length,nums2.length);
        int [] a=new int[l];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                if (k==0||a[k-1]!=nums1[i]){
                    a[k]=nums1[i];
                    k++;
            }
            i++;j++;
            }
        }
    return Arrays.copyOf(a,k);
    }
}