import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a positive integer: ");
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();

        System.out.println("Please enter another positive integer: ");
        temp = new Scanner(System.in);
        int x = temp.nextInt();

        String answer = print(n);
        System.out.println(answer);

        int f = factorial(n);
        System.out.println(f);

        int fib = fib(n);
        for (int i = 1; i <= n; i++)
            System.out.print(fib(i) + " ");

        int eyes = eyes(n);
        System.out.println(eyes);

        int power = power(n, x);
        System.out.println(power);

        int speakers = speakers(n);
        System.out.println(speakers);

        /*int sum = sum(n);
        System.out.println(sum);*/
    }

    //Print the numbers from n to 1.
    public static String print(int n) {
        if (n == 1)
            return "1";
        else
            return Integer.toString(n) + " " + print(n-1);
    }

    //Print n!
    public static int factorial(int n) {
        if (n == 1)
            return n;
        else
            return n*factorial(n-1);
    }

    //Print fibonacci to nth term, not working.
    public static int fib(int n) {
        if (n <= 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    //How many eyes on n cats.
    public static int eyes(int n) {
        if (n == 1)
            return n*2;
        else
            return 2 + eyes(n-1);
    }

    //n to the power of x.
    public static int power(int n, int x) {
        if (x == 1)
            return n;
        else
            return n*power(n, x-1);
    }

    //Number of speakers.
    public static int speakers(int n) {
        if (n == 1)
            return 1;
        else
            if (n%2 == 0)
                return 2 + speakers(n-1);
            else
                return 1 + speakers (n-1);
    }

    /*Add digits of integer.
    public static int sum(int n) {

    }*/





}
