class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
         Map<String, Integer> map = new HashMap<>();

         for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);

        }
        List<String> result = new ArrayList<>();
        int minn = Integer.MAX_VALUE;

         for (int j = 0; j < list2.length; j++) {
            String cur=list2[j];

            if(map.containsKey(cur))
            {
                int i = map.get(cur);
               int cursum=i+j;
                if(cursum<minn)
                {
                    minn=cursum;
                    result.clear();
                    result.add(cur);

                }
                else if(cursum==minn)
                {
                    result.add(cur);
                }
            }
         }
         return result.toArray(new String[0]);
    }
}