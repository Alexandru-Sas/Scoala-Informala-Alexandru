package personal.homeworks.homework2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Homework.getMaxDigit(12345123));


        System.out.println(Homework.isPalindrome(143262341));
        int n = 143262341;
        if (Homework.isPalindrome(n)) {
            System.out.println( n + " is a palindrome");
        } else {
            System.out.println( n + " is not palindrome");
        }
        System.out.println(Homework.getPrimeNumber(2,20));

        System.out.println(Homework.getMinFromArray(new int[]{88,21,23,24,21,45,87,43,121,432}));



        System.out.println(Homework.getSumOfFirst100(100));




    }
}
