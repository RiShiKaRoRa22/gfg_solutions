class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return backtrack(arr, 0,k,0);
        
    }
    
    public boolean backtrack(int[] arr, int sum, int k, int ind){
        if(sum==k){
            return true;
        }
        else if(sum>k){
            return false;
        }
        for(int i=ind;i<arr.length;i++){
            sum=sum+arr[i];
            if(backtrack(arr, sum, k,i+1)){
                return true;
            }
            sum=sum-arr[i];
            