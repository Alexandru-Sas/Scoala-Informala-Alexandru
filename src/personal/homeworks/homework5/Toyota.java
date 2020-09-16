package personal.homeworks.homework5;

public abstract class Toyota extends Car{
    protected String model;

    public Toyota(int tankSize, FuelType fuelType, int gears, double consumption, float availableFuel, int tireSize, String chassisNumber, int currentGear, String model) {
        super(tankSize, fuelType, gears, consumption, availableFuel, tireSize, chassisNumber, currentGear);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
