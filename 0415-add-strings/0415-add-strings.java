import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       int i=num1.length()-1;
       int  j=num2.length()-1;
       int car=0;
       StringBuilder sb=new StringBuilder();
       while(i>=0 || j>=0||car>0)
       {
          int n1=(i>=0)?num1.charAt(i--)-'0':0;
          int n2=(j>=0)?num2.charAt(j--)-'0':0;
         int  sum=n1+n2+car;

           sb.append(sum%10);
           car=sum/10;
           
       }
       return sb.reverse().toString();
    }
}

        //  BigInteger no1 = new BigInteger(num1);
        // BigInteger no2 = new BigInteger(num2);
        // BigInteger sum = no1.add(no2);
        // return sum.toString();

        // int s1=Integer.parseInt(num1);
        // int s2=Integer.parseInt(num2);
        // int sum=s1+s2;

        // return String.valueOf(sum);
    //}
//}