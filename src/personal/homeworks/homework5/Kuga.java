package personal.homeworks.homework5;

public class Kuga extends Ford{
    private double currentConsumption;
    public Kuga(float availableFuel, int tireSize, String chassisNumber) {
        super(75, FuelType.DIESEL, 5, 9, availableFuel, tireSize, chassisNumber, 0, "Kuga");
    }

    public String getModelName() {
        return model;
    }

    public double getCurrentConsumption() {
        return currentConsumption;
    }

    @Override
    public void start() {
        System.out.println(model + " has started! Consumption is " + consumptionPerDrive);
        consumptionPerDrive = 0;
    }

    @Override
    public void stop() {
        if (getCurrentConsumption() >= availableFuel) {
            System.out.println("NO MORE FUEL");
        }else {
            System.out.println(getModelName() + " ,consumed = " + getCurrentConsumption() + " and it has: " + (getAvailableFuel() - getCurrentConsumption()) + " fuel left");
            System.out.println(model + " has stopped!");
        }
    }

    @Override
    public void drive(double km) {
        //todo: update consumption per drive with getConsumption result
        if(getConsumptionPerDrive(km) <= availableFuel) {
            System.out.println(getModelName() + " drives " + km + " kilometers" + " in gear " + currentGear + " ,car consumed = " + getConsumptionPerDrive(km) + " and it has: " + (getAvailableFuel() - getConsumptionPerDrive(km)) + " fuel left");
        }else{
            System.out.println("No more fuel!");
        }
    }

    public double getConsumptionPerDrive(double km) {
        //todo: get current gear, tireSize and calculate consumption per current km drive
        if (getCurrentConsumption() >= availableFuel) {
            System.out.println("NO MORE FUEL");
        }else if (currentGear == getGears() && km == 100) {
            currentConsumption = getConsumption();
        }else if(currentGear == getGears() && km > 100 && km > 0) {
            currentConsumption = getConsumption() * (km / 100);

        } else {
            currentConsumption = ((getConsumption()*km) / 100) - (0.1*currentGear) + (0.2 * tireSize);

        }
        return currentConsumption;
    }
    public float getAvailableFuel() {
        return availableFuel - (float)currentConsumption;
    }

    @Override
    public String toString() {
        return "Supra{" +
                "model='" + model + '\'' +
                ", availableFuel=" + availableFuel +
                ", tireSize=" + tireSize +
                ", chassisNumber='" + chassisNumber + '\'' +
                '}';
    }
}
