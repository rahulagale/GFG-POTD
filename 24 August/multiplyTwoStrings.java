class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger num1 = new BigInteger(s1);

        BigInteger num2 = new BigInteger(s2);

        

        BigInteger product = num1.multiply(num2);

        

        return product.toString();
    }
}
