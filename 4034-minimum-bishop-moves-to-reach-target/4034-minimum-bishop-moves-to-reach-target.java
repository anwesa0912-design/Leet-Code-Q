class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int r1=source[0],r2=source[1];
        int c1=target[0],c2=target[1];
        if((r1+r2)%2!=(c1+c2)%2){
            return -1;
        }
        if(r1-r2==c1-c2||r1+r2==c1+c2){
            return 1;
        }
        return 2;
    }
}