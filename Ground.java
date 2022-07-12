public class Ground extends Transport{
    private int wheels;
    private int fuelConsumption;
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public Ground(int power, int speed, int weight, String model, int wheels, int fuelConsumption) {
        super(power, speed, weight, model);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wheels=" + getWheels() +
                ", fluelConsumption=" + getFuelConsumption() +
                '\'';

    }
}
