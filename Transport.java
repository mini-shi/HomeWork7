public class Transport {
    int power;
    int speed;
    int weight;
    String model;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Transport(int power, int speed, int weight, String model) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Transport {" + "power=" + power +
                ",pw2=" + calc(power) +
                ",speed=" + speed +
                ",weight=" + weight +
                ",model=" + model + '\'';
    }
    public int calc(int power){
        return (int) (power * 0.74);
    }
}
