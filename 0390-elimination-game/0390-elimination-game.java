class Solution {
    public int lastRemaining(int n) {
     if(n==1){
        return n;
     }   
        int a=remain(n,1,1,true);
        return a;
    }
    int remain(int r,int s,int l,boolean left){
        if(r==1){
            return s;
        }
        if(left||r%2==1){
            s+=l;
        }
        return remain(r/2,s,l*2,!left);
    }
}