class Solution {
    public boolean find132pattern(int[] nums) {
        int l=nums.length;
        if(l<3) return false;
        int[] back=new int[l];
        int m=l;
        int k=Integer.MIN_VALUE;
        for(int i=l-1;i>=0;i--){
            if(nums[i]<k){
                return true;
            }
            while(m<l&&nums[i]>back[m]){
                k=back[m];
                m++;
            }
            m--;
            back[m]=nums[i];
        }
        return false;
    }
}