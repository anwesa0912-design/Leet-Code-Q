class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb=new StringBuilder();
        ArrayList<Long> r=new ArrayList();
        if(numerator==0) return "0";
        if((numerator<0)^(denominator<0)) sb.append("-");
        long n=Math.abs((long)numerator);
        long d=Math.abs((long)denominator);
        sb.append(n/d);
        long rd=n%d;
        if(rd==0) return sb.toString();
        sb.append(".");
        int bl=sb.length();
        while(rd!=0){
            if(r.contains(rd)){
                int fi=r.indexOf(rd);
                int pos=bl+fi;
                sb.insert(pos,"(");
                sb.append(")");
                break;
            }
            r.add(rd);
            rd*=10;
            sb.append(rd/d);
            rd %=d;
        }
        return sb.toString();
    }

}