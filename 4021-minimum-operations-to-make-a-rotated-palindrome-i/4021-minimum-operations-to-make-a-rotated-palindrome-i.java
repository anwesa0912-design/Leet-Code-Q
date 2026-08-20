class Solution {
    public int minOperations(String s) {
       int n=s.length();
       int minx=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        int ccost=i;
        for(int j=0;j<n/2;j++){
            char c1=s.charAt((j+i)%n);
            char c2=s.charAt((n-1-j+i)%n);
            int d=Math.abs(c1-c2);
            int chcost=Math.min(d,26-d);
            ccost+=chcost;
        }
        minx=Math.min(minx,ccost);
       }
       return minx;
}
}