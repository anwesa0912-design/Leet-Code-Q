class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       
        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int as=convert(arriveAlice,days);
        int ae=convert(leaveAlice,days);
        int bs=convert(arriveBob,days);
        int be=convert(leaveBob,days);
        int s=Math.max(as,bs);
        int l=Math.min(ae,be);
        return Math.max(0,l-s+1);
        
    }
    int convert(String date,int[] days){
        String[] parts=date.split("-");
        int m=Integer.parseInt(parts[0]);
        int d=Integer.parseInt(parts[1]); 
        int t=d;
        for(int i=0;i<m-1;i++){
            t+=days[i];
        }
        return t;
    }
}