class Solution {
    public int[][] generateMatrix(int n) {
      int a=0;
      int top=0,bottom=n-1;
      int left=0,right=n-1;
      int matrix2[][]=new int[n][n];

      while(top<=bottom&&left<=right)
      {
        for(int i = left;i<=right;i++){
            matrix2[top][i]=++a;
        }
        top++;
        for(int i=top;i<=bottom;i++){
            matrix2[i][right]=++a;
            
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                matrix2[bottom][i]=++a;
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                matrix2[i][left]=++a;
            }
            left++;
        }
      } 
      return matrix2; 
    }
}