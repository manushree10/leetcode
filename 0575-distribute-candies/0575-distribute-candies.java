class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>set=new HashSet<>();
        for(int num:candyType)
        {
            set.add(num);
        }
        return set.size()>=candyType.length / 2?candyType.length/2:set.size();
    }
}