class Solution {
    public int[][] generateMatrix(int n) {
        int t=0,l=0,v=1;
        int b=n,r=n;
        int [][]a=new int[n][n];
        while(t<b&&l<r){
            for(int j=l;j<r;j++){
                a[t][j]=v++;
            }
            t++;
            for(int i=t;i<b;i++){
                a[i][r-1]=v++;
            }
            r--;
            if(t<b){
            for(int j=r-1;j>=l;j--){
                a[b-1][j]=v++;
            }
            b--;
            }
            if(l<r){
            for(int i=b-1;i>=t;i--){
                a[i][l]=v++;
            }
            l++;
            }

        }
        return a;
    }
}