class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;int []a=new int[2];int []b={-1,-1};
        int k=0;
       while(s<=e){
        int m=s+(e-s)/2;
        if(nums[m]<target){
            s=m+1;
        }
        else if(nums[m]>target){
            e=m-1;

        }
        else{
            k++;
          
            if(m==0||nums[m-1]!=target){ 
                a[0]=m;
                break;
            }
            else{
                e=m-1;
            }
        }
       }
       int st=0,ed=nums.length-1;
       while(st<=ed){
          int m=st+(ed-st)/2;
        if(nums[m]<target){
            st=m+1;
        }
        else if(nums[m]>target){
            ed=m-1;

        }
        else{
            
            if(m==nums.length-1||nums[m+1]!=target)  {
                a[1]=m;
                break;}
            else{
                st=m+1;
            }
        }
       }
        if(k==0) return b;
        return a;
    }
}