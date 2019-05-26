public class Class {

    public static int factorial(int n){
        if (n<2) return 1;
        return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if (n<2) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int example(int n){
        if(n<=0)
            return 1;
        else
            return n*example(n-1);
    }

    //1 examp
    public static int sum(int n){
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }
    //2 examp - powering
    public static int result(int n) {
        if (n == 1)
            return 2;
        else
            return 2 * result(n - 1);
    }

    //Example 3
    public static int mystery(int n, int a, int d){
        if (n == 1)
            return a;
        else
            return d + mystery(n - 1, a, d);
    }

    //Example 4
    public static int f(int k, int n)
    {
        if (n == k)
            return k;
        else
            if (n > k)
                return f(k, n - k);
            else
                return f(k - n, n);
    }

    // Part of recursion exercises
    public static void strRecur(String s)
    {
        if(s.length() < 6)
        {
            System.out.println(s);
            strRecur(s + "*");
        }
    }

    public static void printString(String s){
        if(s.length() > 0)
        {
            printString(s.substring(1));
            System.out.println(s.substring(0,1));
        }
    }

    //Example 3
    public static void doSomething(int n)
    {
        if(n > 0 )
        {
            doSomething(n - 1);
            System.out.println(n);
            doSomething(n - 1);
        }
    }

    //Example 4
    

    public static void main(String args[]){
        System.out.println(factorial(5));
        System.out.println(fibonacci(5));

        System.out.println(example(4));

        System.out.println(sum(10));

        System.out.println(result(4));

        System.out.println(mystery(3,2,6));

        System.out.println(f(6,8));

        strRecur("wyo");

        printString("wyo");

        doSomething(4);
    }

}