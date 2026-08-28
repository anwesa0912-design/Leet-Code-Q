class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      for(int i=triangle.size()-2;i>=0;i--){
        for(int j=0;j<=i;j++){
            int l=triangle.get(i+1).get(j);
            int r=triangle.get(i+1).get(j+1);
            int m=Math.min(l,r);
            int c=triangle.get(i).get(j);
            triangle.get(i).set(j,c+m);
        }
      }
      return triangle.get(0).get(0);
    }
}