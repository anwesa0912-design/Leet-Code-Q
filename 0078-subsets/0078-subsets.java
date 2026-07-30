class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
      backtrack(0,new ArrayList<>(),nums,ans);
      return ans;  
    }
    void backtrack(int s,List<Integer>c,int[]nums,List<List<Integer>>ans){
        ans.add(new ArrayList<>(c));
        for(int i=s;i<nums.length;i++){
            c.add(nums[i]);
            backtrack(i+1,c,nums,ans);
            c.remove(c.size()-1);
        }
    }
}