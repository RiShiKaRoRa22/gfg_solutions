class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int[] res= new int[arr.length];
        int k=0;
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                res[stack.peek()]=arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            res[stack.peek()]=-1;
            stack.pop();
        }
        
        ArrayList<Integer> ar= new ArrayList<>();
        for(int i:res){
            ar.add(i);
        }
        return ar;
    }
}