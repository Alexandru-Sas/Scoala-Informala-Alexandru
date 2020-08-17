package personal.homeworks.homework4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SalesRepresentative> sales = new ArrayList<>();
        List<SalesRepresentative> salesSorted = new ArrayList<>();

        SalesRepresentative representative1 = new SalesRepresentative(500, 12);
        System.out.println(representative1.salesAmount());
        SalesRepresentative representative2 = new SalesRepresentative(600,11);
        System.out.println(representative2.salesAmount());
        SalesRepresentative representative3 = new SalesRepresentative(800 , 8);
        System.out.println(representative3.salesAmount());
        SalesRepresentative representative4 = new SalesRepresentative(900, 6);
        System.out.println(representative4.salesAmount());

        sales.add(representative1);
        sales.add(representative2);
        sales.add(representative3);
        sales.add(representative4);

        BubbleSort sort = new BubbleSort();
        salesSorted = sort.bubbleSort(sales);
        sort.printArray(salesSorted);

        SalesRepresentative person1 = new SalesRepresentative(400, 321);
        System.out.println(person1.toString());




    }

}
