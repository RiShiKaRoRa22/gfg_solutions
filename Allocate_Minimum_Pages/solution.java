class Solution {
    public int findPages(int[] arr, int k ) {
        // code here
        if(arr.length<k){
            return -1;
        }
        //Arrays.sort(arr);
        
        
        int s=0;
        int maxx=Integer.MIN_VALUE;
        for(int i: arr){
            s+=i;
            maxx=Math.max(maxx,i);
        }
        int end=s;
        int start=maxx;
        
        //System.out.println(end);
        int ans=0;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(canAlloc(arr,mid,k)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return ans;
    }
    
    public boolean canAlloc(int arr[], int max, int t){
        int sum=0;
        int k=1;
        for(int i=0;i<arr.length;i++){
            
            if(sum+arr[i]<=max){
                sum=sum+arr[i];
               
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