class Solution {
    public List<String> topKFrequent(String[] words, int k) {
    
      HashMap<String , Integer> map = new HashMap<>();
        for(String word : words) map.put(word , map.getOrDefault(word , 0)+1);

        PriorityQueue<String> pq = new PriorityQueue<>((String a , String b)-> map.get(a)==map.get(b)? b.compareTo(a): map.get(a)-map.get(b));

        for(String s : map.keySet()){
            pq.add(s);
            if(pq.size()>k) pq.remove();
        }

        List<String> res = new ArrayList<>();

        while(!pq.isEmpty()){
          res.add(pq.remove());

        }
        Collections.reverse(res);
        return res;
    }
}
