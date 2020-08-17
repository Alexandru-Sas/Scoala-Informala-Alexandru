package personal.homeworks.homework4;


import personal.homeworks.homework3.Book;

import java.util.List;

public class BubbleSort {

    public List<SalesRepresentative> bubbleSort(List<SalesRepresentative> salesPerson) {
        int n = salesPerson.size();
        SalesRepresentative temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (salesPerson.get(j - 1).salesAmount() < salesPerson.get(j).salesAmount()) {
                    temp = salesPerson.get(j - 1);
                    salesPerson.set(j - 1, salesPerson.get(j));
                    salesPerson.set((j), temp);

                }

            }

        }

        return salesPerson;
    }

    void printArray (List <SalesRepresentative> salesPerson) {
        int n = salesPerson.size();
        for (int i = 0; i < n; ++i) {
            System.out.print(i+". quota = " + salesPerson.get(i).getQuota() + " nrOfSales = " + salesPerson.get(i).getNrOfSales() + " salesAmount = " + salesPerson.get(i).salesAmount() + "\n");

        }

    }

}
