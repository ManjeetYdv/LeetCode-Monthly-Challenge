class Solution {
    public int minMutation(String start, String end, String[] bank) {

        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        boolean [] vis = new boolean[bank.length];
        int minMutation=0;

        while(queue.size()!=0){
            int size = queue.size();
            
            for(int i=0;i<size ;i++){
                
                String curr = queue.poll();
                if(curr.equals(end)) return minMutation;

                for(int j=0 ;j<bank.length ;j++){
                    if(oneCharDiff(curr , bank[j]) && !vis[j]){
                        vis[j] = true;
                        queue.add(bank[j]);
                    }
                }
            }
            
            minMutation++;

        }

        return -1;

    }

     public boolean oneCharDiff(String a , String b){

        int differences=0;

        for(int i=0;i<8 ;i++){
            if(a.charAt(i)!=b.charAt(i)){
                if(differences==1) return false;
                differences++;
            }
        }

        return differences==1;
    }
}
