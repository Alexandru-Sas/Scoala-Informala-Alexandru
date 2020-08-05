package personal.homeworks.homework2;

public class maxDigit {
    public static void main(String[] args) {
        int n = 854357;
        int max = n % 10;// 3
        while (n != 0) {
            int d = n % 10; // 3
            if (d > max)
                max = d;
            n = n / 10;

        }

        System.out.println(max);

    }
}
