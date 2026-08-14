class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();
        int left=0;
        for(int i=0;i<Math.min(word1.length(),word2.length());i++){
            res.append(word1.charAt(left));
            res.append(word2.charAt(left));
            left++;
        }

        if(word1.length()<word2.length()){
            for(int i=left;i<word2.length();i++){
                res.append(word2.charAt(i));
            }
        }else{
            for(int i=left;i<word1.length();i++){
                res.append(word1.charAt(i));
            }
        }
        return res.toString();
    }
}