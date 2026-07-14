class Solution {
    public int reverse(int x) {
        long r=0,n=x;
        boolean b=false;
        if(x<0){
            n=x*-1;
             b=true;
        }
        while(n>0){
            long d= n%10;
            r=(r*10)+d;
            n/=10;
        }
        if(r>Integer.MAX_VALUE||r<Integer.MIN_VALUE){
            return 0;
        }
        if(b==true){
            return (int)r*-1;
        }
        return (int)r;
    }
}