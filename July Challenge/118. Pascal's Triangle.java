class Solution {
    
    public List<Integer> pascalRow(int n){

        List<Integer> row = new ArrayList<>();
        row.add(1);
        
        int res=1;
        for(int i=0 ; i<n ;i++ ){
            
            res*= (n-i);
            res/=(i+1);
            row.add(res);
        }
        
        return row;
        
        
        
        
    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<>();
        
        for(int i=0 ; i< numRows ;i++){
            List<Integer> row =pascalRow(i);
            pascal.add(row);
        }
        
        return pascal;
    }
}
