class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fiz=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                fiz.add("FizzBuzz");
            }
            else if(i%3==0){
                fiz.add("Fizz");
            }
            else if(i%5==0){
                fiz.add("Buzz");
            }
            else{
                String s=String.valueOf(i);
                fiz.add(s);
            }
        }
        return fiz;
    }
}