class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
       
        Set<Integer>on=new HashSet<>();
        for(int b:bulbs)
        {
            if(on.contains(b))
            {
                on.remove(b);
                
            }
            else
            {
                on.add(b);
            }
        }
        List<Integer>res=new ArrayList<>(on);

        Collections.sort(res);

        return res;
    }
}