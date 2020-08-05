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

    public static int getPalindrome() {
        int n = 1234321;
        int inversat = 0;
        int rest;
        int numarOriginal;
        numarOriginal = n;

        while (n != 0) {
            rest = n % 10;
            inversat = inversat * 10 + rest;
            n = n / 10;
        }


        if (numarOriginal == inversat)
            System.out.println(numarOriginal + " este palindrom.");
        else
            System.out.println(numarOriginal + " nu este palindrom.");


        return numarOriginal;
    }

    public static int getPrimeNumber() {
        int valoareaMica = 2;
        int valoareaMare = 20;
        while (valoareaMica < valoareaMare) {
            boolean prim = false;

            for (int i = 2; i <= valoareaMica / 2; i++) {
                if (valoareaMica % i == 0) {
                    prim = true;
                    break;
                }
            }
            if (!prim && valoareaMica != 0 && valoareaMica != 1)
                System.out.println(valoareaMica + " ");

            ++valoareaMica;
        }

        return valoareaMica;
    }

    public static int getSmallestNumbArray() {
        int[] a = new int[]{13, 14, 17, 21, 3, 9, 2, 8};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Cel mai mic numar dina array este " + min);

        return min;

    }

    public static int getSumOfFirst100() {
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;


        }

        return sum;
    }
}

