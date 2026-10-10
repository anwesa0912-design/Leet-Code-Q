class Solution {
    public int arrangeCoins(int n) {
      int i=0,j=0;
      while(n!=0){
        i++;
        if(n<i){
            return j;
        }
        else
        n=n-i;
        j++;
      } 
      return j; 
    }
}