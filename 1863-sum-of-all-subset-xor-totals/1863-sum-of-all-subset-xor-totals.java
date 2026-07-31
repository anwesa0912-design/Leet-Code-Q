class Solution {
    public int subsetXORSum(int[] nums) {
        return xor(0,0,nums);
    }
    int xor(int i,int cx,int[] a){
        if(i==a.length) return cx;
        int incl=xor(i+1,cx^a[i],a);
        int excl=xor(i+1,cx,a);
        return incl+excl;
    }
}