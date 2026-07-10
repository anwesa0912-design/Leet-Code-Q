class Solution {
    public int numberOfSteps(int num) {
     int c=count(num);
     return c;   
    }
    int count(int n){
        int k=0;
        if(n==0){
            return k;
        }
        else if(n%2==0){
            k++;
            return k+ count(n/2);

        }
        else{
            k++;
            return k+ count(n-1);
        }
    }
}