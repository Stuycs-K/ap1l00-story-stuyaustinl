public class Tester{
    public static void main(String[] args){
        int[] input = {0,1,2,3,4,5,6,7,8,9,10};
        int[] expected = {2,3,5,7,11,13,17,19,23,29,31};
        for (int i = 0; i < input.length; i++)
            {
                if (nthPrime(input[i]) == expected[i])
                    {
                        System.out.println("pass");
                    }
                else
                    {
                        System.out.println("Fail, expected " + expected[i] + ", but value returned was " + nthPrime(input[i]));
                    }
            }
    }

    //return true if and only if x is prime,false otherwise.
    //just check divisibility for all values from `2` through `x - 1` inclusive.
    //(This is not a good algorithm, just use it)
    public static boolean isPrime(int x){
        if (x < 2)
            {
                return false;
            }
        for (int i = x - 1; i > 1; i--)
            {
                if ((x % i) == 0)
                    return false;
            }
        return true;
    }

    //return the nth prime,
    //e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.\
    //Loop through values and check if they are prime until you find n of them
    //use your isPrime function.
    public static int nthPrime(int n){
        for (int i = 0; n >= 0; i++)
            {
                if (isPrime(i))
                    {
                        if (n < 1)
                            {
                                return i;
                            }
                        else
                            {
                                n--;
                            }
                    }
            }
        return -1;
    } 
}