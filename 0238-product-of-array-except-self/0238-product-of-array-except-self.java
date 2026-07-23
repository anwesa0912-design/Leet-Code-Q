class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int l=1,r=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=l;
            l*=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            ans[j]*=r;
            r*=nums[j];
        }
        
       
           
        
        return ans;
    }
}