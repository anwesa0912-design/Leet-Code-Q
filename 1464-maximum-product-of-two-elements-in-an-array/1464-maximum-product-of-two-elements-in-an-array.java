class Solution {
    public int maxProduct(int[] nums) {
      int m=0;int a=0,b=0;
      for(int num:nums){
        if(num>a){
            b=a;
            a=num;
        }
        else if(num>b){
            b=num;
        }
      }
      m=(a-1)*(b-1);
       return m;
    
    }
}