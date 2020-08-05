package personal.homeworks.homework2;

public class smallestNumbArray {
    public static void main(String[] args) {
        int[] a = new int[]{13, 14, 17, 21, 3, 9, 2, 8};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Cel mai mic numar din array este " + min);
    }
}