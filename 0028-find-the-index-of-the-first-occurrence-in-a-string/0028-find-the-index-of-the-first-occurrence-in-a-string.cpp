class Solution {
public:
    int strStr(string haystack, string needle) {
        int hl = haystack.length();
        int nl = needle.length();
        int nIndex = 0;
        for(int i=0; i<hl;i++){
          if(haystack[i]== needle[nIndex]){
            nIndex++;
          }else{
            i = i -nIndex;
            nIndex = 0;
          }

          if (nIndex == nl){
            return i-nl+1;
          }

        }

        return -1;
    }
};