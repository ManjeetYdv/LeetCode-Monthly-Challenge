class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
       //Sorting the row-diagonals
        for (int x = 0; x < mat.length; x++) {
           
            int i=x;
            int j = 0;
            List<Integer> list = new ArrayList<>();
            
    
            while (i < mat.length && j < mat[0].length) { //adding diagonals elements to list
                list.add(mat[i++][j++]);
            }
            
            list.sort((a, b) -> a - b);                  //sorting the diagonal elements
         
            int idx = 0;
            i=x;
            j=0;

            while (i < mat.length && j < mat[0].length) { //updating the diagonal  
                mat[i++][j++] = list.get(idx++);
            }
        }

        
        //Sorting the column diagonals
        for(int y=1 ; y<mat[0].length ;y++){
           
            List<Integer> list =  new ArrayList<>();
            int i=0;
            int j=y;
            

            while(i<mat.length && j<mat[0].length){  //adding diagonals elements to list
                list.add(mat[i++][j++]);
            }

            list.sort((a,  b)->a-b);                 //sorting the diagonal elements   

            int idx=0;
            i=0;
            j=y;
            
            while(i<mat.length && j<mat[0].length){ //updating the diagonal  
                mat[i++][j++] = list.get(idx++);
            }

        }

        return mat;



        
    }
}
