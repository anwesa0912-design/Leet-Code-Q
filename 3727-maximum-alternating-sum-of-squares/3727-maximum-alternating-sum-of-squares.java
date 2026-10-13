class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int k=0;k<nums.length;k++){
            if(nums[k]<0){
                 nums[k]=nums[k]*-1;
             }
        }
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        long s=0;
        int []a=new int[j+1];
        for(int k=0;k<nums.length;k+=2){
            a[k]=nums[j];
            if(k+1<nums.length){
            a[k+1]=nums[i];
            }
            j--;i++;
        }
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                s=s+(long)(a[k]*a[k]);
            }
            else s-=(long)(a[k]*a[k]);
        }
        return s;
    }
}