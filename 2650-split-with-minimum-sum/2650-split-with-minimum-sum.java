class Solution {
    public int splitNum(int num) {
        char[] n=String.valueOf(num).toCharArray();
        Arrays.sort(n);
        StringBuilder n1=new StringBuilder();
        StringBuilder n2=new StringBuilder();

        for (int i = 0; i < n.length; i++)
        {
            if(i%2==0)
            {
                n1.append(n[i]);
            }
            else
            {
                n2.append(n[i]);
            }
        }
        return Integer.parseInt(n1.toString()) + Integer.parseInt(n2.toString());
    }
}