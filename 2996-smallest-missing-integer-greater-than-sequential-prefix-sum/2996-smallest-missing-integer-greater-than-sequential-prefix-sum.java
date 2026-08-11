class Solution {
    public int missingInteger(int[] nums) {
        int s=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                s+=nums[i+1];
            }
            else break;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(s==nums[i]){
                s++;
            }
        }
        return s;
    }
}