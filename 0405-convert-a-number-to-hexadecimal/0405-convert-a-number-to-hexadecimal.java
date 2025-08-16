class Solution {
    public String toHex(int num) {
        //return Integer.toHexString(num);
        if(num==0)return "0";
        char[]  hexchar="0123456789abcdef".toCharArray();
        StringBuilder sb=new StringBuilder();
        while(num!=0)
        {
            int rem=num &15;
            sb.append(hexchar[rem]);
            num=num>>>4;
        }
        return sb.reverse().toString();
    }
}