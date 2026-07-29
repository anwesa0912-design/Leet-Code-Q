class Solution {
    public int pivotInteger(int n) {
        int s=0;
        int a=0;int k=0;
        for(int i=1;i<=n;i++){
            s+=i;
            for(int j=i;j<=n;j++){
                a=a+j;
            }
            if(a==s){
                k=i;
                break;
            }
            a=0;
            }
            if(k==0){
                k=-1;
            }
            
        return k;
    }
}