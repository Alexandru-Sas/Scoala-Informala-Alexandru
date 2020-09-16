package personal.homeworks.homework5;

abstract class Car implements Vehicle {
    protected final int tankSize;
    protected final FuelType fuelType;
    protected final int gears;
    protected final double consumption;
    protected double availableFuel;
    protected int tireSize;
    protected String chassisNumber;
    protected int speed;
    protected int gear;
    protected int currentGear;
    protected double averageConsumptionPerCurrentDrive;
    protected double fuelConsumptionPerCurrentDrive;


    protected Car(int tankSize, FuelType fuelType, int gears, double consumption, float availableFuel, int tireSize, String chassisNumber, int currentGear) {
        this.tankSize = tankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumption = consumption;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
        this.currentGear = currentGear;
    }

    public void shiftGear(int gear) {
        this.currentGear = gear;
        System.out.println("Car shifted in gear " + gear);
    }

    @Override
    public void drive(double km) {
        double consumption = calculateConsumption();
        double consumedFuel = calculateConsumedFuel(consumption, km);
        if (consumedFuel < availableFuel) {
            availableFuel -= consumedFuel;
            fuelConsumptionPerCurrentDrive += consumedFuel;
            if (averageConsumptionPerCurrentDrive != 0) {
                averageConsumptionPerCurrentDrive = (averageConsumptionPerCurrentDrive + consumption) / 2;
            } else {
                averageConsumptionPerCurrentDrive = consumption;
            }
            printDriveInfo(km, consumption, consumedFuel);
        } else {
            System.out.println("Not enough available fuel for this drive!");
        }
    }

    private double calculateConsumedFuel(double consumption, double km) {
        return (km * consumption) / 100;
    }

    private double calculateConsumption() {//consumption/100km
        if (currentGear == getGears()) {
            return consumption;
        } else {
            return consumption + (0.1 * currentGear) + (0.2 * tireSize);
        }
    }

    private void printDriveInfo(double km, double consumption, double consumedFuel) {
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("Car drove " + km + " km in gear " + currentGear + " with a consumption of " +
                consumption + "l/100km, " + consumedFuel + "l fuel used, " + availableFuel + "l available fuel.");
        System.out.println("_____________________________________________________________________________________________________");
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

    public double getConsumption() {
        return consumption;
    }

    public double getAvailableFuel() {
        return availableFuel;
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

    public double getAverageConsumptionPerCurrentDrive() {
        return consumption;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setAvailableFuel(double availableFuel) {
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

    public void setAverageConsumptionPerCurrentDrive(double averageConsumptionPerCurrentDrive) {
        this.averageConsumptionPerCurrentDrive = averageConsumptionPerCurrentDrive;
    }

    public double getFuelConsumptionPerCurrentDrive() {
        return fuelConsumptionPerCurrentDrive;
    }
}