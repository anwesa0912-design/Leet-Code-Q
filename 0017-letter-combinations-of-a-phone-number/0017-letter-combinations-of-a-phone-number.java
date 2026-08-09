class Solution {
    public List<String> letterCombinations(String digits) {
     if(digits.isEmpty()) return new ArrayList<>();
     return convo("",digits); 
      
    }
    public ArrayList<String> convo(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> l=new ArrayList<>();
             l.add(p);
             return l;
        }
        ArrayList<String> a=new ArrayList<>();
        int d=up.charAt(0)-'0';
        int s=(d-2)*3;
        if(d>7)s+=1;
        int e=s+3;
        if(d==7||d==9) e+=1;
        for(int i=s;i<e;i++){
            char c=(char)('a'+i);
            a.addAll(convo(p+c,up.substring(1)));
        }
        return a;
    }
}