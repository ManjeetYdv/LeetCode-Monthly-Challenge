class Solution {
    
    public int[] findOriginalArray(int[] changed) {
        
      
        if(changed.length%2!=0) return new int[0];
        Arrays.sort(changed);

      HashMap<Integer ,Integer> map= new HashMap<>();
      List<Integer>list = new ArrayList<>();

      for(int i : changed) map.put(i , map.getOrDefault(i , 0)+1);

      for(int i: changed){
        if(map.get(i)==0) continue;
        if(!map.containsKey(i*2) || map.get(i*2)==0) return new int[0];
        list.add(i);
        map.put(i  , map.get(i)-1);
        map.put(i*2 , map.get(i*2)-1);

        }

      if(list.size()!=changed.length/2) return new int[0];

      int[]res = new int[list.size()];
      int k=0;
      for(int i: list) res[k++]=i;
      return res;

}
}
