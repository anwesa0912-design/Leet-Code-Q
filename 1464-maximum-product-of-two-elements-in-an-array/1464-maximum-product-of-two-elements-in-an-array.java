class Solution {
    public int maxProduct(int[] nums) {
      int m=0;
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            int n=0;
            if(j!=i)
             n=((nums[i]-1)*(nums[j]-1));
            m=Math.max(m,n);
        }
      }  return m;
    }
}