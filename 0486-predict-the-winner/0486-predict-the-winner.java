class Solution {
    public boolean predictTheWinner(int[] nums) {
        int l=nums.length;
        if (l==1) return true;
        int s1=0,s2=l-1;
        return win(nums,s1,s2)>=0;
    }
    int win(int[] a,int x,int y){
       if(x==y){
        return a[x];
       }
       int lp=a[x]-win(a,x+1,y);
       int rp=a[y]-win(a,x,y-1);
       return Math.max(lp,rp);
    }
}