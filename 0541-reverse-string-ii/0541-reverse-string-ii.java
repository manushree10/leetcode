class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int n = a.length;

        for (int i = 0; i < n; i += 2 * k) {
            int beg= i;
            int end = Math.min(i + k - 1, n - 1);

            while (beg < end) {
                
                char temp = a[beg];
                a[beg] = a[end];
                a[end] = temp;
                beg++;
                end--;
            }
        }
      return new String(a);
    }
}