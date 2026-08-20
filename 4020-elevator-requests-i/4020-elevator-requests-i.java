class Solution {
    public int elevatorRequests(int n, int[] requests) {
       int i=0,l=0,f=0,t=0;
       while(i<requests.length){
        f=requests[i];
        if(l!=f&&f<n+1){
            if(l>f)
            t+=(l-f);
            else t+=(f-l);
        }
        l=f;
        i++;
       }
       return t;
    }
}