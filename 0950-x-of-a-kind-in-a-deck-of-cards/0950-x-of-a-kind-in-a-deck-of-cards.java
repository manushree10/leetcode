class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer>map=new HashMap<>();
        int res=0;
        for(int num:deck)
        {
          map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i : map.values()) res = gcd(i, res);
        return res > 1;
    }
    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}