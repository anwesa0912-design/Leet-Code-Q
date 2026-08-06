class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        StringBuilder s=new StringBuilder();
        while(num!=0){
            int a=num&15;
            if(a==10){
                s.append("a");
            }
            else if(a==11){
                s.append("b");
            }
            else if(a==12){
                s.append("c");
            }
            else if(a==13){
                s.append("d");
            }
            else if(a==14){
                s.append("e");
            }
            else if(a==15){
                s.append("f");
            }
            else s.append(a);
            num>>>=4;
        }
        return s.reverse().toString();
    }
}