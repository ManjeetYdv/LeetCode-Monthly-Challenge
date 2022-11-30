class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : arr) map.put(i , map.getOrDefault(i , 0)+1); //storing frequency of numbers

        Set<Integer> set = new HashSet<>(); //adding occurances to a set ..if it canr be added means its not unique hence return false;
        for(int key : map.keySet()){
            if(!set.add(map.get(key))) return false;
        }
        return true; 
    }
}
