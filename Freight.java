public class Freight extends Ground{
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Freight(int power, int speed, int weight, String model, int wheels, int fuelConsumption, int loadCapacity) {
        super(power, speed, weight, model, wheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", loadCapacity" + getLoadCapacity() +
                '}';
    }

    public void cargoСapacity(int cargoWeight) {
        if (cargoWeight > getLoadCapacity()){
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
    }
}