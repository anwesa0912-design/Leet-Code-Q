class Solution {
    public int minimumDeletions(int[] nums) {
        int max=0,min=0;
        if(nums.length==1)return 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
            if(nums[i]<nums[min]){
                min=i;
            }
        }
       
            int a=Math.min(max,min);
            int b=Math.max(max,min);
            int front=b+1;
            int back=nums.length-a;
            int both=(a+1)+(nums.length-b);
            return Math.min(front,Math.min(back,both));
        
        
    }
}