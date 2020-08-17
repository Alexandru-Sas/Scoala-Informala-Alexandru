package personal.homeworks.homework4;

import java.util.Comparator;
import java.util.Objects;

public class SalesRepresentative {
    private int quota ;
    private int nrOfSales ;


    public SalesRepresentative(int quota, int nrOfSales) {
        this.quota = quota;
        this.nrOfSales = nrOfSales;
    }
    public int salesAmount(){
        int netWorth = nrOfSales * quota;
        return netWorth;
    }


    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getNrOfSales() {
        return nrOfSales;
    }

    public void setNrOfSales(int nrOfSales) {
        this.nrOfSales = nrOfSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesRepresentative that = (SalesRepresentative) o;
        return quota == that.quota && nrOfSales == that.nrOfSales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota, nrOfSales);
    }

    @Override
    public String toString() {
        return "SalesRepresentative {" + "quota=" + quota + ", nrOfSales=" + nrOfSales + '}';
    }
}
