class Solution {
    public int[] buildArray(int[] nums) {
        int[] a=new int[nums.length];
        int i=0;
        for(int n:nums){
            a[i]=nums[n];
            i++;
        }
        return a;
    }
}