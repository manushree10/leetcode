class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> res=new HashSet<>();
        int power=0;
        for(int i=0;i<=20 && Math.pow(x, i) <= bound;i++)
        {
            for(int j=0;j<=20 && Math.pow(y, j) <= bound;j++)
            {
                power=(int)Math.pow(x, i) + (int)Math.pow(y, j);;
                if(power<=bound)
                {
                    res.add(power);
                }
            }
        }
        return new ArrayList<>(res);
    }
}