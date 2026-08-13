class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int b=matrix.length-1;
        int t=0,l=0;
        int r=matrix[0].length-1;
        List<Integer> a=new ArrayList<>();
        if(matrix.length==0) return a;
        while(t<=b&&l<=r){
            for(int i=l;i<=r;i++){
                a.add(matrix[t][i]);
            }
            t++;
            for(int j=t;j<=b;j++){
                a.add(matrix[j][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    a.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int j=b;j>=t;j--){
                    a.add(matrix[j][l]);
                }
                l++;
            }
        }
        return a;
    }
}