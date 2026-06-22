class Solution {
    public boolean isAnagram(String s, String t) {
        char sh[]=s.toCharArray();
        char th[]=t.toCharArray();

        if(sh.length!=th.length){
            return false;
        }
        Arrays.sort(sh);
        Arrays.sort(th);
        for(int i=0;i<sh.length;i++){
            if(sh[i]!=th[i]){
                return false;
            }
        }
        return true;
    }
}
