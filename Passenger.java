public class Passenger extends Ground{
    private String carcass;
    private int numOfPassengers;

    public Passenger(int power, int speed, int weight, String model, int wheels, int fuelConsumption, String carcass, int numOfPassengers) {
        super(power, speed, weight, model, wheels, fuelConsumption);
        this.carcass = carcass;
        this.numOfPassengers = numOfPassengers;
    }

    public String getCarcass() {
        return carcass;
    }

    public void setCarcass(String carcass) {
        this.carcass = carcass;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", carcass = " + getCarcass() +
                ", numOfPassenger=" + getNumOfPassengers() +
                '\'' +
                '}';
    }
    private double countFluel(double time){
        return(time * this.getSpeed())/100.0;
    }
    public void method(double time){
        System.out.println("За время " + time + "ч, автомобиль " + getModel() + "\n" +
                "двигаясь с максимальной скоростью " + getSpeed() + "км/ч\n" +
                "проедет " + time * this.getSpeed() + "км и израсходует " + countFluel(time) + "л. топлива");
    }

}
