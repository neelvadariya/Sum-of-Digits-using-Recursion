public class Sum_Digits {
    
    //function defination

    public static int sumOfDigits(int num)
    {
        //1.base case condition
        if(num==0)
        {
            return 0;
        }
        // 2. Recursive condition
        return (num%10) + sumOfDigits(num/10);
    }
    public static void main(String[] arg)
    {
        int num = 123456;
        int result = sumOfDigits(num);
        System.out.println("The sum of the given digits is: " + result);
    }
}
