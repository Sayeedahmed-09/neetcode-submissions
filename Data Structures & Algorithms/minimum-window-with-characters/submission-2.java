class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n<m){
            return "";
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int start=0;
        int count=t.length();
        int minLen=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)>=0){
                    count--;
                }
            }
            while(count==0){
                char c=s.charAt(i);
                int currLen=j-i+1;
                if(currLen<minLen){
                    minLen=currLen;
                    start=i;
                }
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                    if(map.get(c)>0){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
        
    }
}
