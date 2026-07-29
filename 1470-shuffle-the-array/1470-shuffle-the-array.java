class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int[] a = new int[l];
        for(int i=0;i<l;i++){
            if(i%2==0){
                a[i]=nums[i/2];
            }
            else{
                a[i]=nums[n+(i/2)];
            }
        }return a;
    }
}