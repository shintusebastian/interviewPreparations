public class Main {
    public static void main(String[] args) {
        for (int i = 1; i >= 10; i++) { //this loop will never get executed. The condition is always false.
            System.out.println("The value of i is: " + i);
            ;
        }
//        for (; ; ) // this will end up in an infinite loop
//        {
//            System.out.println("for loop");
//        }


        //factorial of 10 using loop
        float factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("the factorial of first 10 natural numbers is " + factorial);

        //program to find fibonacci series using for loop.


        System.out.println("fibonacci series for first 6 numbers");
        int fibonacci1 = 0, fibonacci2 = 1, fibonacci3 = 0;
        System.out.println(fibonacci1);
        System.out.println(fibonacci2);
        for (int i = 1; i <= 6; i++) {
            fibonacci3 = fibonacci1 + fibonacci2;
            System.out.println(fibonacci3);
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;

        }
        //sum of natural numbers up to 10 using for loop

        int sumOfNaturalNumbers = 0;
        for (int i = 1; i <= 10; i++) {
            sumOfNaturalNumbers += i;
        }
        System.out.println("the sum of first 10 natural numbers using for loop is " + sumOfNaturalNumbers);

        //sum of first 10 natural numbers using while loop

        int n = 1, sumUsingWhile = 0;
        while (n <= 10) {
            sumUsingWhile += n;
            n++;
        }
        System.out.println("the sum using while loop is " + sumUsingWhile);

        int whileFactorial = 1;
        int w = 1;
        while (w <= 10) {
            whileFactorial *= w;
            w++;
        }
        System.out.println("factorial of 10 using while loops is " + whileFactorial);

        //sum of first 10 natural numbers using do-while loop

        int sumNatDoWhile = 0, i = 1;
        do {

            sumNatDoWhile += i;
            i++;
        } while (i <= 10);
        System.out.println("sum of first 10 numbers using do-while is " + sumNatDoWhile);
        int no = 10;
        do {

            System.out.println(no);
            no--;
        } while (no < 1);

        for (int j = 0; j <= 6; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j + " ");
        }
        for (int k = 0; k <= 6; k++) {
            if (k == 4) {
                break;
            }
            System.out.println(k + " ");
        }
        double array[] = new double[5];
        array[0] = 5.8D;
        array[1] = 6.7D;
        array[2] = 9.3D;
        array[3] = 3.7D;
        array[4] = 11.6D;
        double sum = 0;
        for (double s : array) {
            sum += s;
        }

        System.out.println("The sum of the array elements is = " + sum);

        char firstName[] = {'s', 'h', 'i', 'n', 't', 'u'};
        //converting char array to string using String valueOf method.

        System.out.println(String.valueOf(firstName));

        //Creating String object by passing array name to the constructor
        String name = new String(firstName);
        System.out.println(name);

        int aiM[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < 3; j++) {
                System.out.print( " " + aiM[k][j]);
            } // end of inner for
            System.out.println(" "); // to print in next line
        } // end of outer for

    }


}
