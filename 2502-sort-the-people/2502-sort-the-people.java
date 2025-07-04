import java.util.*;
import java.util.Collections;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;

       Map<Integer,String>m=new HashMap<>();

       for(int i=0;i<n;i++)
       {
        m.put(heights[i],names[i]);
       }

      
       Arrays.sort(heights);
       for(int i=0;i<n/2;i++)
       {
        int temp = heights[i];
            heights[i] = heights[n - 1 - i];
            heights[n - 1 - i] = temp;
       }

       for(int i=0;i<n;i++)
       {
        names[i]=m.get(heights[i]);
       }
       return names;
    }
}