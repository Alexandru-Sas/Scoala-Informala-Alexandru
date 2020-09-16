package personal.homeworks.homework5;

public class Supra extends Toyota{
    public Supra(float availableFuel, int tireSize, String chassisNumber) {
        super(75, FuelType.DIESEL, 6, 13, availableFuel, tireSize, chassisNumber, 0, "Supra");
    }


    @Override
    public void start() {
        averageConsumptionPerCurrentDrive = 0;
        fuelConsumptionPerCurrentDrive = 0;
        System.out.println(model + " has started, drive safe!");
    }

    @Override
    public void stop() {
        System.out.println(model + " has stopped, in this drive the car consumed " + fuelConsumptionPerCurrentDrive +
                "l with an average consumption of " + averageConsumptionPerCurrentDrive + "l/100km.");

    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", availableFuel=" + availableFuel +
                ", tireSize=" + tireSize +
                ", chassisNumber='" + chassisNumber + '\'' +
                '}';
    }
}
