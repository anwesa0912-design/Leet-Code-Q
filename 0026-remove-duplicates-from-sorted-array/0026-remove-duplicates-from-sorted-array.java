class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,j=0;int []a=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
                
            }
        }
        return j+1;
    }
}