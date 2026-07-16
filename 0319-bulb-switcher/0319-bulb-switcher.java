class Solution {
    public int bulbSwitch(int n) {
        long s=0,e=n,a=0;
        while(s<=e){
            long m=s+(e-s)/2;
            long sq=m*m;
            if(sq<n){
                s=m+1;
                a=m;
            }
            else if(sq>n) {
                e=m-1;
            }
           else{
            return (int)m;
           }
        }return (int)a;
    }
}