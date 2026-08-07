class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] a=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                a[k]=nums1[i];
                k++;i++;
            }
            else{
                a[k]=nums2[j];
                k++;j++;
            }
        }
        while(i<m){
            a[k]=nums1[i];
            k++;i++;
        }
        while(j<n){
            a[k]=nums2[j];
            k++;j++;
        }
        for(int p=0;p<m+n;p++){
            nums1[p]=a[p];
        }
    }
    
}