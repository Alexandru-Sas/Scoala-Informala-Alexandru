package personal.homeworks.homework2;

public class sumOfFirst100N {

    public static void main(String[] args) {
        int n = 100;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
