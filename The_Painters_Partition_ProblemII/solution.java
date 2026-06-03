class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        //min time to paint a board
        //minimize the maximum time
        
        int sum=0;
        int maxx=Integer.MIN_VALUE;
        
        for(int i: arr){
            sum+=i;
            maxx=Math.max(maxx,i);
        }
        int end=sum;
        int start=maxx;
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(canDo(arr,mid,k)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
        
    }
    
    public boolean canDo(int[] arr, int max, int t){
        //if painters can do work ki maxx work will be max and can be divided into <=number of painters
    
        int sum=0;
        int k=1;
        
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=max){
                sum+=arr[i];
            }
            else{
                k++;
                sum=arr[i];
            }
        }
        
        if(k<=t){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
