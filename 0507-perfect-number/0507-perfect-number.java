class Solution {
    public boolean checkPerfectNumber(int num) {
    if(num<2) return false;
     int s=1;int n=num;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            int nums=num/i;
            s+=i;
            if(nums!=i){
            s+=nums;
            }
        }
    } 
    if(s==n) return true;
    else return false;
    }
}