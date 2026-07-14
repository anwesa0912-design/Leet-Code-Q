class Solution {
    public double myPow(double x, int n) {
        boolean neg=false;double m=1.0;
        long y=(long)n;
        if(n<0){
            neg=true;
            y=-y;
        }
        while(y>0){
            if(y%2==1){
                m*=x;
            }
            x*=x;
            y/=2;
        }
        double ans=0;
        if(neg==true){
            ans=1/m;
        }
        else{
            ans=m;
        }return ans;
    }
}