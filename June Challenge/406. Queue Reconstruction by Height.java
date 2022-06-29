class Solution {
    
    /*
        people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
        Output: [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]

        1. sort on the basis of height decresing order, if height same then take the onw which is smaller
        people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
        sort: [7,0],[7,1],[6,1],[5,0],[5,2],[4,4]

        2. now just add people at the index where they want to as we are picking the max height first so we are sure that at the given index there is already ith values places which have greater height as well
        */
    public int[][] reconstructQueue(int[][] people) {
        
         Arrays.sort(people, (a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        
        ArrayList<int[]> res= new ArrayList<>();
        for(int[] person: people){
            res.add(person[1], person);
        }
        
        return res.toArray(new int[people.length][2]);
    }
}
