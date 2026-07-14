class Solution {
    public boolean isHappy(int n) {
        int s=n;
        int m=0,d=0;
        while(s!=1 && s!=4){
            d=s;
            s=0;
            while(d>0){
                m=d%10;
                s+=(m*m);
                d=d/10;
            }
        }
        if(s==1){
            return true;
        }
        return false;
    }
}