class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer>set=new HashSet<>();
        int num=0;
        for(int i=0;i<n;i++)
        {
            if(digits[i]==0)
            {
                continue;
            }
            for(int j=0;j<n;j++)
            {
                 if( i==j)
                 {
                    continue;
                 }   
                for(int k=0;k<n;k++)
                {
                    if(j==k||k==i)
                    {
                        continue;
                    }
                   num=digits[i]*100+digits[j]*10+digits[k];
                   if(num%2==0 && !set.contains(num))
                   {
                    set.add(num);
                   }
                }
            }
        }
        return set.size();
    }
}