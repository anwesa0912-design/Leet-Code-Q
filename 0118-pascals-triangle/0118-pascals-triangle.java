class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int n1=tri.get(i-1).get(j-1);
                    int n2=tri.get(i-1).get(j);
                    row.add(n1+n2);
                }
            }
            tri.add(row);
        }
        return tri;
    }
}