class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      


           HashMap<String,List<String>>  mapResult = new HashMap<>();

           for (String s:strs){


             char[] array=s.toCharArray();

                Arrays.sort(array);


             String keyWord=new String(array);


             if(!mapResult.containsKey(keyWord)){

                mapResult.put(keyWord,new ArrayList<>());

             }
             mapResult.get(keyWord).add(s);


           }
           return new ArrayList<>(mapResult.values());


        
    }
}
