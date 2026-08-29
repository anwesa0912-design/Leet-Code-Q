class Solution {
    public int minFlips(String s) {
        int n=s.length();
        int total1=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') total1++;
        }
        int total0=n-total1;
        int b=(total1==0)?0:total1-1;
        int c=total0;
        int a=Math.min(b,c);
       if(n>=2){
        int t=(s.charAt(0)=='1')?0:1;
        t+=(s.charAt(n-1)=='1')?0:1;
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='1') t++;
        }
        a=Math.min(a,t);
       }
        return a;
    }
}