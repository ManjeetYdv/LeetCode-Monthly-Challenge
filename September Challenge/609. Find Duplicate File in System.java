class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        
         List<List<String>> res = new ArrayList<>();
         HashMap<String , List<String>> map = new HashMap<>();

         for(int i=0 ;i<paths.length ;i++){

             String directory = paths[i];
             String[] splitStr = directory.split("\\s+");   //regex for empty space or " "
             String initialPath =  splitStr[0];        //eg -> root/a/c

             for(int j=1 ;j<splitStr.length ;j++){

                 String file = splitStr[j];
                 int idx = file.indexOf('(');
                 String fileContent = file.substring(idx+1 , file.length()-1);
                 String location = file.substring(0 , idx);

                 if(!map.containsKey(fileContent)) map.put(fileContent , new ArrayList<>());
                 map.get(fileContent).add(initialPath+'/'+location);
              }


         }
         
         for(String s : map.keySet()){
             
             if(map.get(s).size()>=2){
                 res.add(map.get(s));
             }
         }
         
         return res;
         
    }
}
