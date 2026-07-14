class Solution {
    public boolean isPalindrome(int x) {
        int z=0;int s=0;
        int m=x;
        while(m>0){
            s=m%10;
            m/=10;
            z=(z*10)+s;
            
        }
        boolean r=true;
        if(z != x){
            r=false;
        }
        else{
            r =true;
        }return r;
    }
}