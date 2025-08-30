import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
         BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);
        BigInteger sum = no1.add(no2);
        return sum.toString();

        // int s1=Integer.parseInt(num1);
        // int s2=Integer.parseInt(num2);
        // int sum=s1+s2;

        // return String.valueOf(sum);
    }
}