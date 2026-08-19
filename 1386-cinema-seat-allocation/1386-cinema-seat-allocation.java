class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats,(a,b)->Integer.compare(a[0],b[0]));
        int t=0;
        int p=0;
        int i=0;
        int l=reservedSeats.length;
        while(i<l){
            int c=reservedSeats[i][0];
            boolean lb=false;
            boolean rb=false;
            boolean mlb=false;
            boolean mrb=false;
            while(i<l&& reservedSeats[i][0]==c){
                int col=reservedSeats[i][1];
                if(col==2||col==3) lb=true;
                else if(col==4||col==5)mlb=true;
                else if(col==6||col==7)mrb=true;
                else if(col==8||col==9)rb=true;
                i++;
            }
            p++;
            boolean la=!lb&&!mlb;
            boolean ra=!rb&& !mrb;
            boolean ma=!mlb&&!mrb;
            if(la&&ra){
                t+=2;
            }
            else if(la||ra||ma){
                t+=1;
            }
        }  
        t+=(n-p)*2;
        return t;
    }
}