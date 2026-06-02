class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        //largest min distance, if min distance found, shift to right to find larger
        //bin search to find maximum of min distance
        Arrays.sort(stalls);
        int start=1;
        int end=stalls[stalls.length-1];
        int ans=0;
        
        while(start<=end){
            int mid= (start+end)/2;
            if(canPlace(stalls,mid,k)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
        
        return ans;
    }
    
    public boolean canPlace(int[] stalls, int dist, int t){
        int lastplaced=0;
        int k=1;
        
        for(int i=1;i<stalls.length;i++){
            if(Math.abs(stalls[lastplaced]-stalls[i])>=dist){
                k++;
                lastplaced=i;
            }
            
        }
        if(k>=t){
                return true;
        }
        else{
            return false;
            
        }
        
        
            
        
    }
}