class Solution {
    public int countPrimes(int n) {
        int c=0;
        if(n<3) return 0;
        boolean[] p=new boolean[n];
        for(int i=2;i<n;i++) p[i]=true;
        for(int i=2;i*i<n;i++){
            if(!p[i]) continue;
            for(int j=i*i;j<n;j+=i){
                p[j]=false;
            }
        }
        for(int i=2;i<n;i++){
            if(p[i])c++;
        }
        return c;
    }
}