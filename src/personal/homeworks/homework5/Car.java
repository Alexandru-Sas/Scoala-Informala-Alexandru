package personal.homeworks.homework5;

abstract class Car implements Vehicle {
    private int tankSize;
    private FuelType fuelType;
    private int gears;
    private float consumption;
    protected float availableFuel;
    protected int tireSize;
    protected String chassisNumber;
    protected int speed;
    protected int gear;
    protected int currentGear;
    protected double consumptionPerDrive;


    protected Car(int tankSize, FuelType fuelType, int gears, float consumption, float availableFuel, int tireSize, String chassisNumber, int currentGear) {
        this.tankSize = tankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumption = consumption;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
        this.currentGear = currentGear;
    }

    public int getTankSize() {
        return tankSize;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getGears() {
        return gears;
    }

    public float getConsumption() {
        return consumption;
    }

    public float getAvailableFuel() {
        return availableFuel ;
    }

    public int getTireSize() {
        return tireSize;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public double getConsumptionPerDrive(double km) {
        return (consumption*km)/100;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setConsumptionPerDrive(double consumptionPerDrive) {
        this.consumptionPerDrive = consumptionPerDrive;
    }

    public void shiftGear(int gear){
        this.currentGear = gear;
        System.out.println("Car is in gear " + gear);

    }

}
