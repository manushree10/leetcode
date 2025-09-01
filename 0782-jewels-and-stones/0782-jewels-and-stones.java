class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:stones.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int cnt=0;
        for(char c1:jewels.toCharArray())
        {
            if(map.containsKey(c1))
            {
                cnt+=map.get(c1);
            }
        }
        return cnt;
    }
}