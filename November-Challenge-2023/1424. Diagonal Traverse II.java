class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        // int count=0;
        // HashMap<Integer , List<Integer>> map = new HashMap<>();
        // for(int i= 0;i<nums.size() ;i++){
        //     for(int j=0 ;j< nums.get(i).size() ;j++){
        //         count++;
        //         int sum = i+j;
        //         int num = nums.get(i).get(j);
                
        //        if(map.containsKey(sum)) map.get(sum).add(num);
        //        else{
        //            map.put(sum , new ArrayList<>());
        //            map.get(sum).add(num);
        //        }
        //     }
        // }
        // int res[]= new int[count];
        // int index=0;
        // for(int key : map.keySet()){
        //     List<Integer> temp = map.get(key);
        //     for(int i=temp.size()-1 ;i>=0 ;i--) res[index++] = temp.get(i);
        // }
        
        // return res;

    //same logic fails with hashmap but not with list of list
    //     int count=0;
    //    List<List<Integer>> map = new ArrayList<>();
       
    //     for(int i= 0;i<nums.size() ;i++){
    //         for(int j=0 ;j< nums.get(i).size() ;j++){
    //             count++;
    //             int sum = i+j;
    //             int num = nums.get(i).get(j);

    //            if(sum<map.size()) map.get(sum).add(num);
    //             else{
    //                 map.add(sum , new ArrayList<>());
    //                 map.get(sum).add(num);
    //             }
    //         }
    //     }
    //     int res[]= new int[count];
    //     int index=0;
    //     for(List<Integer> temp : map){
    //         for(int i=temp.size()-1 ;i>=0 ;i--) res[index++] = temp.get(i);
    //     }
    //      System.out.println(map);

    //     return res;

        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{nums.get(0).get(0) , 0 , 0});

        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
           
            int[] arr = queue.poll();
            list.add(arr[0]);
            int r = arr[1];
            int c = arr[2];

            if(c==0) {
                if ((r + 1) < nums.size()) queue.add(new int[]{nums.get(r + 1).get(c), r + 1, c});
            }

            if((c+1)<nums.get(r).size()) queue.add(new int[]{nums.get(r).get(c+1) , r , c+1});

        }
        int []res = new int[list.size()];
        int index=0;
        for(int ele : list) res[index++] = ele;
        return res;
    }  
}
