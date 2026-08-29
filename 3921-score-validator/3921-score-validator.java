class Solution {
    public int[] scoreValidator(String[] events) {
       int s=0,c=0;
       for(int i=0;i<events.length;i++){
        if(events[i].equals("W")){
            c++;
        }
        else if(events[i].equals("WD")){
            s+=1;
        }
        else if(events[i].equals("NB")){
            s+=1;
        }
        else{
            int n=Integer.parseInt(events[i]);
            s+=n;
        }
        if(c==10) break;
       } 
       int[]a=new int[2];
       a[0]=s;
       a[1]=c;
       return a;
    }
}