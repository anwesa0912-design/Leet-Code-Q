class Solution {
    public int majorityElement(int[] nums) {
       int l=nums.length;
       int m=nums[0],c=0;
       for (int i=0;i<l;i++){
            if(nums[i]==m){
                c++;
            }
            else if(c==0){
                m=nums[i];
            }
            else{
                c--;
            }
       }return m; 
    }
}