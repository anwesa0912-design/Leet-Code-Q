class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
         int d=0;
         boolean a = true;
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int s=arr[i];
                    arr[i]=arr[j];
                    arr[j]=s;
                }
            }
         }
         if (arr.length == 1){
            return true;
         } 
         else{
         int b= arr[1]-arr[0];
           
         for(int i=0;i<arr.length-1;i++){
            d=arr[i+1]-arr[i];
             if(d != b){
                 a=false;
                 
             }
             

         }}return a;
    }
}