class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int r=drones.length;
        int m=Integer.MAX_VALUE,c=-1;
        for(int i=0;i<r;i++){
            int d=0;
          
                d=Math.abs((drones[i][0]-target[0]))+Math.abs((drones[i][1]-target[1]));

            
            if(d<=drones[i][2]){
              if(d<m){
                    c=i;
                
                m=d;}
            }
            
        }
       
        return c;
            }
}