class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0;
        int e=nums.length-1;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[e]!=nums[e-1]) return nums[e];
        while(s<=e){
            int m=(s+e)/2;
            if(m!=0&&m!=nums.length-1&&nums[m]!=nums[m+1]&&nums[m]!=nums[m-1]){
                return nums[m];
            }
            else if(m!=0&&m!=nums.length-1&&(m%2==0&&nums[m]==nums[m+1])||(m%2!=0&&nums[m]==nums[m-1])){
                s=m+1;
            }
            else e=m-1;

        }
        return -1;
    }
}