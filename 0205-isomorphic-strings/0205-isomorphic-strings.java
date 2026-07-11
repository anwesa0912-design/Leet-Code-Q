class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] ps=new int[256];
        int[] pt=new int[256];
        for(int i=0;i<s.length();i++){
           char cs=s.charAt(i);
           char ct=t.charAt(i);
           if(ps[cs]!=pt[ct]){
            return false;
           }
            ps[cs]=i+1;
            pt[ct]=i+1;    
        }return true;
    }
}