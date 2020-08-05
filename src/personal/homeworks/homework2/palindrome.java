package personal.homeworks.homework2;

public class palindrome {
    public static void main(String[] args) {

        long number1 = 1234567654321L, inapoiNumber = 0, rest, numarOriginal;

        numarOriginal = number1;


        while (number1 != 0) {
            rest = number1 % 10;
            inapoiNumber = inapoiNumber * 10 + rest;
            number1 = number1 / 10;
        }


        if (numarOriginal == inapoiNumber)
            System.out.println (numarOriginal + " este palindrom.");
        else
            System.out.println (numarOriginal + " nu este palindrom.");


    }
}
