package personal.homeworks.homework2;

public class primeNumber {
    public static void main(String[] args) {
        int valoareaMica = 2;
        int valoareaMare = 20;
        while (valoareaMica < valoareaMare){
            boolean prim = false;

            for (int i = 2; i <= valoareaMica/2 ; i++){
                if (valoareaMica % i == 0) {
                    prim = true;
                    break;
                }
            }
            if (!prim && valoareaMica != 0 && valoareaMica != 1)
                System.out.println(valoareaMica + " ");

            ++valoareaMica;
        }
    }
}
