class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c=0,k=0;
        Arrays.sort(g);
        Arrays.sort(s);
            while(c<g.length&&k<s.length){
                if(g[c]<=s[k]){
                    c++;
                }
                k++;
            }

         return c;
    }
    }