class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        int res=high;

        while(low<=high){
            int cap=low+(high-low)/2;
            if(canShip(weights,days,cap)){
                res=Math.min(res,cap);
                high=cap-1;
            }else{
                low=cap+1;
            }
        }
        return res;
    }


    public boolean canShip(int weights[],int days,int cap){
        int ships=1,curcap=cap;
        for(int w:weights){
            if(curcap-w<0){
                ships++;
                if(days<ships){
                    return false;
                }
                curcap=cap;
            }
            curcap-=w;
        }
        return true;
    }
}