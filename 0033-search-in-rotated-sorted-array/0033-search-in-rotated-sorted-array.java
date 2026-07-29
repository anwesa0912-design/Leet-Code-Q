class Solution {
    public int search(int[] nums, int target) {
      int p=pivot(nums);
      if(target>=nums[p]&& target<=nums[nums.length-1]){
        return binary(nums,target,p,nums.length-1);
      }  
      else{
        return binary(nums,target,0,p-1);
      }
        
    }
    public int pivot(int[] nums){
        int s=0; int e=nums.length-1;
        while(s<e){
            int m= s+(e-s)/2;
            if(nums[m]>nums[e]){
                s=m+1;
            }
            else if (nums[m]<nums[e]){
                e=m;
            }
           
            } return s;
       
    }
    public int binary(int [] a,int t,int st,int ed){
       int i=-1;
        while(st<=ed){
            int md=st+(ed-st)/2; 
            if(a[md]<t){
                st=md+1;
            }
            else if(a[md]>t){
                ed=md-1;
            }
            else{
                i=md;
                break;
            }
        }return i;
    }
}