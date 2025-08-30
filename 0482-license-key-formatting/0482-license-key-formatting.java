class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replace("-","").toUpperCase();
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
            count++;
            if(count==k && i!=0){
                ans.append("-");
                count=0;
            }
        }
        return ans.reverse().toString();
    }
}