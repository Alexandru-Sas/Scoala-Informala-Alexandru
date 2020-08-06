package personal.homeworks.homework2;
public class Homework {
    public static int getMaxDigit(int n) {
        int max = n % 10;// 3
        while (n != 0) {
            int d = n % 10; // 3
            if (d > max)
                max = d;
            n = n / 10;
        }
        return max;
    }

    public static boolean isPalindrome(int n ) {
         int original = n;
        int mirror = 0;
        int remainder;


        while (n != 0) {
            remainder = n % 10;
            mirror = mirror * 10 + remainder;
            n = n / 10;
        }

        return mirror == original;
    }

    public static int getPrimeNumber(int lowValue,int highValue) {

        while (lowValue < highValue) {
            boolean prime = false;

            for (int i = 2; i <= lowValue / 2; i++) {
                if (lowValue % i == 0) {
                    prime = true;
                    break;
                }
            }
            if (!prime && lowValue != 0 && lowValue != 1)
                System.out.println(lowValue + " ");

            ++lowValue;
        }

        return lowValue;
    }

    public static int getMinFromArray(int[] a) {

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;

    }

    public static int getSumOfFirst100(int n) {

        return (n/2)*(1+n) ;
    }
}

