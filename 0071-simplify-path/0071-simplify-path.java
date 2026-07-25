class Solution {
    public String simplifyPath(String path) {
        String k="";
        String []parts=path.split("/");
        String []n= new String[parts.length];
        int c=0;
        for(String part:parts){
            if(part.isEmpty()||part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(c>0){
                    c--;
                }
            }
            else{
                n[c]=part;
                c++;
            }
        }
        if(c==0) return "/";
        for(int i=0;i<c;i++){
            k+="/"+n[i];
        }
    return k;
    }
}