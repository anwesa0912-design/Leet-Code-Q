class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList();
       Arrays.sort(nums);
       set(0,new ArrayList<>(),nums,ans);
       return ans; 
    }
    void set(int s,List<Integer>c,int[]a,List<List<Integer>>r){
        r.add(new ArrayList<>(c));
        for(int i=s;i<a.length;i++){
            if(i>s && a[i]==a[i-1]){
                continue;
            }
            c.add(a[i]);
            set(i+1,c,a,r);
            c.remove(c.size()-1);
        }
    }
}