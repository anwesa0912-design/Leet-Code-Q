class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String [] words=words=paragraph.toLowerCase().split("\\W+");
        String com="";
        int max=0;
        for(int i=0;i<words.length;i++){
            String w=words[i];
            if(w.isEmpty()) continue;
            boolean ban=false;
            for(String word:banned){
                if(word.equals(w)){
                    ban=true;
                    break;
                }
            }
            if (ban){
                continue;
            }
            int count=0;
            for(int j=0;j<words.length;j++){
                if(words[j].equals(w)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                com=w;
            }
            
        }
        return com;
    }
}