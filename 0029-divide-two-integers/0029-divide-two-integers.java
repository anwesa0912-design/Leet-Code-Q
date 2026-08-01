class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        boolean b=false;
        long dd=dividend;
        long d=divisor;
        if ((d < 0 && dd > 0) || (d > 0 && dd < 0)) {
    b = true;
}
        if(d==1) return (int)dd;
        if(d==-1) return (int)-dd;
        if(d==dd) return 1;
        if(d==-dd) return -1;
        if(d==-1&&dd<0) return (int)-dd;
        int k=0;
        if(d<0) d=-d;
        if(dd<0)dd=-dd;
        while(dd>=d)
        {
            dd-=d;
            k++;

        }
        if(b==true){
            return -k;
        }
        return k;
    }
}