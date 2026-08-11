class Solution {
    public int missingInteger(int[] nums) {
        int s=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                s+=nums[i+1];
            }
            else break;
            
        }
        while(contains(nums,s)){
            s++;
        }
        return s;
    }
    public boolean contains(int[]num,int t){
        for(int n:num){
            if(n==t) return true;
        }
        return false;
    }
}