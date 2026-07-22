class Solution {
    public int fib(int n) {
      if(n<3&&n!=0) return 1;
      if(n==0) return 0;
      int ans=fibonacci(1,1,n,3);
      return ans;  
    }
    int fibonacci(int o,int t,int m,int c){
        
        if(c>m){
          return t; 
            
        }
        
        return fibonacci(t,o+t,m,c+1);
        

        
    }
}