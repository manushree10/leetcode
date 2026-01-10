class Solution {
    public String defangIPaddr(String address) {
     return address.replace(".","[.]");

    //     char[] c=address.toCharArray();
    //     List<String>ch1=new ArrayList<>();
    //     for(char ch:c)
    //     {
    //         if(ch=='.')
    //         {
    //             ch1.add("[.]");
    //         }
    //         else{
    //         ch1.add(String.valueOf(ch));
    //         }
    //     }
    //     StringBuilder sb=new StringBuilder();
    //     for(String c1:ch1)
    //     {
    //         sb.append(c1);
    //     }
    //    return  sb.toString();
     }
}