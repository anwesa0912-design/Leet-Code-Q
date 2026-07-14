class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n1=nums1.length; int n2=nums2.length;
       int tLen=n1+n2; int t=tLen/2;
       int p=0,q=0;
       int c=0,b=0;
       for(int i=0;i<=t;i++)
       {
        b=c;
        if(p<n1&&(q>=n2||nums1[p]<=nums2[q])){
            c=nums1[p++];
        }else{
            c=nums2[q++];
        }
       }     
       if(tLen%2!=0){
        return c;
       }   return(b+c)/2.0;

        }
    }
