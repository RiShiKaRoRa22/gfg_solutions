class Solution {
    ArrayList<String> res= new ArrayList<>(); 
    
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        StringBuilder sb=new StringBuilder();
        maze[0][0]=0;
        backtrack(maze,0,0 ,sb);
        
        return res;
        // code here
        
    }
    
    public void backtrack(int[][] maze,  int ii, int jj, StringBuilder sb){
        //after visitng mark as 0, i j 
        if(ii==maze.length-1 && jj==maze[0].length-1){
            res.add(sb.toString());
            return;
        }
        //if right , add R in solution, call backtrack , undo backtrack
        
        /*for(int ii=i;ii<maze.length;ii++){
            for(int jj=j;jj<maze[0].length;jj++){*/
            //down
                if(ii<maze.length-1 && maze[ii+1][jj]==1 ){
                    maze[ii+1][jj]=0;
                    sb.append("D");
                    backtrack(maze,ii+1,jj, sb);
                    sb.deleteCharAt(sb.length()-1);
                    maze[ii+1][jj]=1;
                    
                }
                //left
                if(jj>0 && maze[ii][jj-1]==1){
                    maze[ii][jj-1]=0;
                    sb.append("L");
                    backtrack(maze,ii,jj-1,sb);
                    sb.deleteCharAt(sb.length()-1);
                    maze[ii][jj-1]=1;
                    
                }
                //right
            
                if(jj<maze[0].length-1 && maze[ii][jj+1]==1){
                    maze[ii][jj+1]=0;
                    sb.append("R");
                    backtrack(maze,ii,jj+1, sb);
                    sb.deleteCharAt(sb.length()-1);
                    maze[ii][jj+1]=1;
                    
                }
                
                //up
                if(ii>0 && maze[ii-1][jj]==1){
                    maze[ii-1][jj]=0;
                    sb.append("U");
                    backtrack(maze,ii-1,jj,sb);
                    sb.deleteCharAt(sb.length()-1);
                    maze[ii-1][jj]=1;
                    
                }
                
                
                
                
               
                
                
                
              
            
        
    }
}