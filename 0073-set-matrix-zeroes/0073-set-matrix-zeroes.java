class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean[] zr=new boolean[r];
        boolean[]zc=new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                 zr[i]=true;
                 zc[j]=true;
                }
            }
      
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(zr[i]||zc[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}